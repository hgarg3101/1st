package com.capgemini.lab4;

public class Savings extends Account {
	private final double minimumBalance=500;
	//overriding method of account 
	void withdraw(double amt){
		 double check;
			check=super.getBalance()-amt;
			if(check>minimumBalance){
				super.withdraw(amt);
			}
		}
}
