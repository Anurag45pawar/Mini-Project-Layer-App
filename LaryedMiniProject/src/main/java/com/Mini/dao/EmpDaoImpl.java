package com.Mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.Mini.model.*;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Mini.model.Employee;
//db connection through datasource object
@Repository("empRepo")
public class EmpDaoImpl implements Idao {
	
	@Autowired
	private DataSource ds;
	
	private static final String sql="select * from Emp where empid in(?,?,?) order by empsalary desc ";
	//when use auto incremetn in primary key we use mention fields in that
	
	private static final String Insert="insert into emp(empname, empdept, empsalary) VALUES (?, ?, ?)";
	
	@Override
	public List<Employee> getEmpDesg(int d1,int d2,int d3) throws Exception {
		List<Employee> list=new ArrayList<>();
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);	
				){
			
			ps.setInt(1,d1);
			ps.setInt(2, d2);
			ps.setInt(3, d3);
			try(ResultSet rs=ps.executeQuery()){
				
				while(rs.next()) {
					Employee emp=new Employee();
					
					emp.setEpmid(rs.getInt(1));
					emp.setEmpname(rs.getString(2));
					emp.setEmpdept(rs.getString(3));
					emp.setEmpsalary(rs.getDouble(4));
					
					
					list.add(emp);
					
				}
				
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		};
		
		
		
		return list;
	}

	@Override
	public int InsertEmp(Employee emp) throws Exception {
		int result=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(Insert);)	
		{
			ps.setString(1,emp.getEmpname());
			ps.setString(2,emp.getEmpdept());
			ps.setDouble(3,emp.getEmpsalary());
			
			result=ps.executeUpdate();
			
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
