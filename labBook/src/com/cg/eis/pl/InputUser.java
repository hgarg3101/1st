package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.Service;

public class InputUser extends Service {

	public static void main(String[] args) {
		Service obj= new Service();
		Integer id;
		String name;
		double salary;
		Scanner s= new Scanner(System.in);
		id=s.nextInt();
		name=s.next();
		salary=s.nextDouble();
		obj.empDetails(id, name, salary);
		System.out.println(obj.getDesignation());
		System.out.println(obj.getName()+" "+obj.getSalary()+" "+obj.getId());
		s.close();

	}

}
