package com.cg.eis.exception;

import java.util.Scanner;

import com.cg.eis.pl.InputUser;
import com.cg.eis.service.Service;

class SalaryException extends Exception{
	double salary;
	SalaryException(double salary){
		this.salary=salary;
	}
	public String toString() {
		return "Your Salary is "+salary+". Employee salary cannot be below than 3000.";
		
	}
}

public class Class6_3 extends InputUser {
	public static void main(String[] args){
		Service obj= new Service();
		
		Integer id;
		String name;
		double salary;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Integer id");
		id=s.nextInt();
		System.out.println("Enter name");
		name=s.next();
		System.out.println("Enter salary");
		salary=s.nextDouble();
		try {
			if(salary<3000)
				throw new SalaryException(salary);
		}
		catch(SalaryException e) {
			e.printStackTrace();
		}
		obj.empDetails(id, name, salary);
		System.out.println(obj.getDesignation());
		System.out.println(obj.getName()+" "+obj.getSalary()+" "+obj.getId());
		s.close();

	}

}
