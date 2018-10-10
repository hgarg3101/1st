package com.capgemini.core;


class MyException extends Exception{
	int a;
	
	MyException(int a){
		super(Integer.toString(a));
		this.a=a;
		
	}
	MyException(String a){
		super(a);
		
	}
	public String toString(){
		return "Exception occured, No. " +a;
	}
}	

public class Custom {

	public static void main(String[] args) {
		try{
			throw new MyException(6);	
		}
		catch(MyException e){
			System.out.println(e.getMessage());
			System.out.println(e);
		}

	}

}
