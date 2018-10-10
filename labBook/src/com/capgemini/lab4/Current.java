package com.capgemini.lab4;

public class Current extends Account {
	private long overdraft=-2000;
	private boolean flag=true;
	 void withdraw(double amt){
		 double check;
			check=super.getBalance()-amt;
			if(check<overdraft){
				flag=false;
			}
				
		}
	
}
