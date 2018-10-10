package com.capgemini.lab4;
abstract class AccountNew{
	public abstract void withdraw(double amt);
}
public class Account extends Person{
	private long accNum=87;
	private double balance;
	private Person accHolder=new Person();
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(double amt){
		this.balance+=amt;
	}
	 void withdraw(double amt){
		this.balance-=amt;
	}
	boolean checkMin(double balance){
		if(balance<500)
			return true;
		return false;			
	}
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.accHolder.setName("smith");
		a1.accHolder.setAge(78);
		a1.setBalance(2000.00);
		if(a1.checkMin(a1.getBalance())){
			System.out.println("Insufficient balance for "+ a1.accHolder.getName());
		}
		Account a2 = new Account();
		a2.accHolder.setName("kathy");
		a2.accHolder.setAge(78);
		a2.setBalance(3000.00);
		a1.deposit(2000.00);
		a2.withdraw(2000.00);
		if(a2.checkMin(a2.getBalance())){
			System.out.println("Insufficient balance for "+ a2.accHolder.getName());
	
		}
		System.out.println(a2);
	

	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}

	

}
