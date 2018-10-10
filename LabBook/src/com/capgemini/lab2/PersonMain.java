package com.capgemini.lab2;

enum Gender{
	M,F;
}


public class PersonMain extends Class2_3 {
	
	public static void main(String[] args) {
		Class2_3 a = new Class2_3();
		Gender g =Gender.F;
		Person obj= a.new Person("Divya","Bharati",g);
		obj.setPnum("9992459069");
		obj.display();
	}

}
