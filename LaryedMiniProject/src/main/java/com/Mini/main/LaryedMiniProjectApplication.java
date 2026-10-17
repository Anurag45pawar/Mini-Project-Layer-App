package com.Mini.main;

import java.util.List;
import java.util.Scanner;

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
		 
		 Scanner scan=new Scanner(System.in);
		 Employee empp=new Employee();
		 
		 System.out.println("Enter emp name");
		 
		 empp.setEmpname(scan.nextLine());
		 
		 System.out.println("Enter empdept");
		 
		 empp.setEmpdept(scan.nextLine());
		 
		 System.out.println("Enter empSalary");
		 
		 empp.setEmpsalary(scan.nextDouble());
		 
		 try {
			 String msg=empx.processValues(empp);
			 
			 System.out.println(msg);
		 }catch(Exception e) {
			 
			 e.printStackTrace();
		 }
		 
		try {
			
			List<Employee> lists=empx.geetingEmp(1,2,3);
			
			 lists.forEach(System.out::println);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("problems Occur in Programm");
		}
	}

}
