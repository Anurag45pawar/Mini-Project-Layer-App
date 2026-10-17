package com.Mini.dao;

import java.util.List;

import com.Mini.model.Employee;

public interface Idao {

	public List<Employee> getEmpDesg(int d1,int d2,int d3) throws Exception;
	
	public int InsertEmp(Employee emp)throws Exception;
		
		
		
		
	
}
