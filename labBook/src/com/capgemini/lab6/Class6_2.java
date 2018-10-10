package com.capgemini.lab6;

import com.capgemini.lab4.Account;
import com.capgemini.lab4.Person;

class AgeException extends Exception{
	Integer a;
	AgeException(Integer a){
		this.a=a;
	}
	public String toString() {
		return "Your age is "+a+". Age should be greater than 15.";
	}
}

public class Class6_2 extends Account{
	public static void main(String...s){
		Account a1 = new Account();
		a1.setAccHolder(new Person());
		a1.getAccHolder().setName("smith");
		a1.getAccHolder().setAge(8);
		a1.setBalance(2000.00);
		try {
		if(a1.getAccHolder().getAge()<15) {
			throw new AgeException(a1.getAccHolder().getAge());
		}
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
		System.out.println(a1);
	}
}
