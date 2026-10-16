package com.Mini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Mini.model.Employee;
import com.Mini.service.EmpService;
@Controller("Econ")
public class EmpController implements Icontroller{
	@Autowired
	private EmpService emps;
	@Override
	public List<Employee> geetingEmp(int d1,int d2,int d3) throws Exception {
		
		return emps.fetchEmp( d1, d2, d3);
		
	}

}
