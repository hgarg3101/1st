package com.capgemini.lab7;

import java.util.Arrays;

public class Class7_1 {
	

	public static void main(String[] args) {
		String pnames[]=new String[3];
		pnames[0]="Cat";
		pnames[1]="Grapes";
		pnames[2]="Apple";
		System.out.println("Before sorting:");
		for(String s: pnames){
			System.out.println(s);
		}
		Arrays.sort(pnames);
		System.out.println("After sorting:");
		for(String s: pnames){
			System.out.println(s);
		}
	
		/*
		 Arrays method:
		 
		 */
		
	}
}
