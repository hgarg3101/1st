package com.capgemini.core;
import java.io.*;

public class SerializeEmployee{

	public static void main(String[] args) throws IOException{
		Employee e1 = new Employee();
		e1.setId(123);
		e1.setName("Rakul");
		e1.setSalary(12000.00);
		
		FileOutputStream fos = new FileOutputStream("emp.txt");  
		
		//to save state of this instance in this file is serialization.
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		System.out.println("Object of employee is serialized: ");
		fos.close();
		oos.close();
	}
}
