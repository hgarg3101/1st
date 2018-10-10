package com.capgemini.lab2;


public class Class2_1 {
	
	static {
		//static unnamed no need to create object
		System.out.println("Person Details:\n----------------");
		System.out.println("First Name: Divya");
		System.out.println("Last Name: Bharathi");
		System.out.println("Gender: F");
		System.out.println("Age: 20");
		System.out.println("Weight: 85.55");
		
	}
	
	 {
		//unnamed will execute while creating object
		System.out.println("Person Details:\n----------------");
		System.out.println("First Name: Divya");
		System.out.println("Last Name: Bharathi");
		System.out.println("Gender: F");
		System.out.println("Age: 20");
		System.out.println("Weight: 85.55");
		
	}
	 
	 //if function is named whether static or not it has to be called.
	 //static using class or directly, no concept of object in static
	 //non static named methods needs to call from object

	public static void main(String[] args) {
		//Class2_1 obj= new Class2_1();
		//obj.person();

	}

}
