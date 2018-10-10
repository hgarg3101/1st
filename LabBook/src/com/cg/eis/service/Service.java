package com.cg.eis.service;

import com.cg.eis.bean.Employee;

interface EmployeeService{
	public void empDetails(Integer id, String name,double salary);
	public String findScheme();
	public void display();
}


public class Service extends Employee implements EmployeeService {
	public void empDetails(Integer id, String name,double salary){
	super.setId(id);
	super.setName(name);
	super.setSalary(salary);
	findScheme();
	}
	public String findScheme(){
		StringBuffer insuranceScheme = new StringBuffer("");
		StringBuffer designation = new StringBuffer("");
		
		if(super.getSalary()>5000&&super.getSalary()<20000){
			insuranceScheme.append("Scheme C");
			designation.append("System Associate");
		}
		else if(super.getSalary()>20000&&super.getSalary()<40000){
			insuranceScheme.append("Scheme B");
			designation.append("Programmer");
		}
		else if(super.getSalary()>40000){
			insuranceScheme.append("Scheme A");
			designation.append("Manager");
		}
		else{
			insuranceScheme.append("NO Scheme");
			designation.append("Clerk");
		}
		super.setinsuranceScheme(insuranceScheme.toString());
		super.setDesignation(designation.toString());
		return super.getinsuranceScheme();
	}
	public void display(){
		
	}
}
