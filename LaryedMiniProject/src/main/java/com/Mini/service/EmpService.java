package com.Mini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mini.dao.Idao;
import com.Mini.model.Employee;
//business logic
@Service("empService")
public class EmpService implements Iservice{

	@Autowired
	private Idao idao;
	@Override
	public List<Employee> fetchEmp(int d1,int d2,int d3) throws Exception {
		
		List<Employee> list=idao.getEmpDesg( d1, d2,d3);
		
		list.forEach(emp->{
			
			emp.setGrosssalary(emp.getEmpsalary()*25);
			emp.setNetsalary(emp.getEmpsalary()*12);
			
		});
		
		return list;
	}
	@Override
	public String registerEmployee(Employee emp) throws Exception {
		
		int k=idao.InsertEmp(emp);
		
		return k!=0?"inserted values":"not inserted values";
	}

}
