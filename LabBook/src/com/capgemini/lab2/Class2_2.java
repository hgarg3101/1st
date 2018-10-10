package com.capgemini.lab2;

public class Class2_2 {
	void checkSign(int n){
		if(n>=0)
			System.out.println("Positive number");
		else
			System.out.println("Negative number");
	}

	public static void main(String[] args) {
		Class2_2 obj= new Class2_2();
		obj.checkSign(Integer.valueOf(args[0]));

	}

}
