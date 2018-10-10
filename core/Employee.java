package com.capgemini.core;

import java.io.Serializable;

public class Employee implements Serializable {
	
	//java bean class as there is no main method and members are private to access them we need getters and setters.	
	private Integer id;
	private String name;
	private Double salary;
	
	public String getName(){
		return name;
	}
	public Integer getId(){
		return id;
	}
	
	public Double getSalary(){
		return salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setSalary(Double salary){
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

}
