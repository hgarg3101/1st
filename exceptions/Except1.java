package com.capgemini.exceptions;

public class Except1 {

	public static void main(String[] args) {
		
		try{
			int a[]= new int[4];
			 for (int i=0;i<=5;i++)
			a[i]=22+i;
			
			return ;
			
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();	
		}
		

	}

}
