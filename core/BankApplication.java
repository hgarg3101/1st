package com.capgemini.core;
import java.security.SecureRandom;
import java.util.Scanner;

class InsufficientFund extends Exception{    //userdefined exception extending predefined Exception class
	Integer a;
	InsufficientFund(Integer a){
		this.a=a;
	}
	public String toString(){
		return "You entered Rs. "+a+"\nBank Amount cannot be less than 500.\nAccount cannot be created.";
	}
	
}

public class BankApplication {
	
	public int checkPass(String p){
		if(p.matches("[a-zA-Z0-9]{7}"))   //using regular expression
			return 1;
		return 0;
		
	}
	public int checkName(String n){
		if(n.matches("[a-z A-Z]+"))   //using regular expression
			return 1;
		return 0;
		
	}
	public int confirm(char c){
		if(c=='Y'||c=='y')   //using regular expression
			return 1;
		return 0;
		
	}
	public static void main(String[] args) throws InsufficientFund{
		String name,pass;
		Integer amt,acc;
		char c;
		Scanner s= new Scanner(System.in);
		SecureRandom rand =new SecureRandom();
		BankApplication b=new BankApplication();
		System.out.print("***Welcome/Vannakam to Mera_Tera Bank (What's Yours is mine(That's what she said))***\n\n");
		System.out.print("Please, Enter your name: ");
		name=s.nextLine();   //to get input with spaces
		
		System.out.print("\nPlease, Enter your passport number: (Only 7 AlphaNumeric characters are allowed) ");
		pass=s.next();
	
		System.out.print("\nPlease, Enter amount: (Greater than 500) ");
		amt=s.nextInt();
		
		System.out.println("\n**Account Details***");
		System.out.println("Name: "+name);
		System.out.println("Passport number: "+pass);
		System.out.println("Amount entered: "+amt);
		System.out.println("\nConfirm details, to confirm enter Y/N: ");
		c=s.next().charAt(0);
		
		if(b.confirm(c)==0){
			System.out.println("Program terminating!!!");
			System.out.println("Program closed!!!");
			System.exit(0);
		}
		 
		if(b.checkName(name)==0){   //can use directly String.matches method.
			System.out.println("Incorrect format of name");
			System.out.println("Only Alphabets are allowed!!!");
			System.out.println("Program terminating!!!");
			System.out.println("Program closed!!!");
			System.exit(0);
		}
		
		if(b.checkPass(pass)==0){   //can use directly String.matches method.
			System.out.println("Incorrect format of passport number");
			System.out.println("length of number can not be more than 7. Only Alphabets and number are allowed!!!");
			System.out.println("Program terminating!!!");
			System.out.println("Program closed!!!");
			System.exit(0);
		}
		if(amt<500)
			throw new InsufficientFund(amt);
	/*	try{    //if throws not declared
	 * 
		if(amt<500)
			throw new InsufficientFund(amt);
		}
		catch(InsufficientFund e){
			System.err.println(e);
			System.out.println("***Bloody cheapskate***\nIt's no Modi jan dhan yojna...aur do bjp ko vote!!!\n");
			System.out.println("Program terminating!!!");
			System.out.println("Program closed!!!");
			System.exit(0);
			
		}*/
		acc=rand.nextInt(100000000);  //ten crore //1 billion
		if(acc.toString().length()<7){  //to make sure my account number is 8 digit long
			acc=acc+10000000;
			
		}
		
		System.out.println("\nCongratulations!!!"+name+"\nAccount Created !!!\nYour unique account no. is: "+acc);
	
		
		s.close();
	}

}
