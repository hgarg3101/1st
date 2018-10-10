package com.capgemini.lab7;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Class7_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//<> generics
		ArrayList<String> al= new ArrayList<String>();
		System.out.println("Enter the no. of values you want to store");
		Integer n=sc.nextInt();
		System.out.println("Enter "+n+" values:");
		for(int i=0;i<n;i++) {
			al.add(sc.next());
		}
		System.out.println(al.size()+" values are added to the list");
		System.out.println("Before sorting:");
		for(String s: al){
			System.out.println(s);
		}
		Collections.sort(al);
		
		System.out.println("After sorting:");
		for(String s: al){
			System.out.println(s);
		}
	
		/*
		 Collections api metthods:
		 
		 addAll(collection,elements);
		 copy(list dest, list src);
		 fill(List , obj);
		 int frequency(collections c, object o);
		 indexofSublist
		 lastindddexofSublist
		 max
		 min
		 replaceAll(List, T oldval, T new val);
		 reverse(list);
		 sort(list);
		 
		 
		 */
		
	}
}
