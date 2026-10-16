package com.Mini.service;

import java.util.List;

import com.Mini.model.Employee;

public interface Iservice {

	
	public List<Employee> fetchEmp(int d1,int d2,int d3)throws Exception;
}
