package com.Mini.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Mini.controller.EmpController;
import com.Mini.controller.Icontroller;
import com.Mini.model.Employee;

@SpringBootApplication
@ComponentScan(basePackages = "com.Mini")
public class LaryedMiniProjectApplication {
@Autowired
private Icontroller icon;	
	
	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx=SpringApplication.run(LaryedMiniProjectApplication.class, args);
		 
		 EmpController empx=ctx.getBean("Econ",EmpController.class);
		 
		try {
			
			List<Employee> lists=empx.geetingEmp(1,2,3);
			
			 lists.forEach(System.out::println);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("problems Occur in Programm");
		}
	}

}
