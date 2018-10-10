package com.capgemini.core;

//final class A{}  a final class can not be inherited
 class A{
	 
	//private void display()
	protected void display(){
		System.out.println("a.display");
	}
	
		
}
public class Inheritance1 extends A{
	
	
	 //only inner class can be made private or protected

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance1 obj=new Inheritance1();
		obj.display();
		

	}

}
