package com.Mini.model;
import lombok.Data;


public class Employee {

	//match columns in Db table
	

	private Integer epmid;
	private String empname;
	private String empdept;
	private Double empsalary;
	
	//service layer calculate this
	private Double grosssalary;
	
	private Double netsalary;
	


	public Integer getEpmid() {
		return epmid;
	}

	public void setEpmid(Integer epmid) {
		this.epmid = epmid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	public Double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(Double empsalary) {
		this.empsalary = empsalary;
	}

	public Double getGrosssalary() {
		return grosssalary;
	}

	public void setGrosssalary(Double grosssalary) {
		this.grosssalary = grosssalary;
	}

	public Double getNetsalary() {
		return netsalary;
	}

	public void setNetsalary(Double netsalary) {
		this.netsalary = netsalary;
	}
	@Override
	public String toString() {
	    return "Employee [epmid=" + epmid
	            + ", empname=" + empname
	            + ", empdept=" + empdept
	            + ", empsalary=" + empsalary
	            + ", grosssalary=" + grosssalary
	            + ", netsalary=" + netsalary + "]";
	}

}
