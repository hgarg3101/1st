package com.capgemini.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
public class CompareProg {
	public static void main(String[] args) {
		char c='y';
		int a,b;
		Integer count =new Integer(0);
		TreeSet t1= new TreeSet();
		ArrayList ls= new ArrayList();
		TreeSet t2= new TreeSet();
		
		t1.add(2);
		t1.add(3);
		t1.add(4);
		ls.add(2);
		ls.add(4);
		ls.add(3);
		
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("**Ready to input data for your TreeSet**");
		while(c=='Y'||c=='y'){
			System.out.println("Input data now");
			t1.add(s.nextInt());
			System.out.println("Want to add more?\nEnter your choice y/n");
			c=s.next().charAt(0);
		}
		c='y';
		System.out.println("**Ready to input data for your ArrayList**");
		while(c=='Y'||c=='y'){
			System.out.println("Input data now");
			ls.add(s.nextInt());
			System.out.println("Want to add more?\nEnter your choice y/n");
			c=s.next().charAt(0);
		}
		*/
		if(t1.isEmpty()){
			System.out.println("Your treeset is empty");
			System.out.println("\nTerminating\n***closed***");
			System.exit(0);
		}
		if(ls.isEmpty()){
			System.out.println("Your Arraylist is empty");
			System.out.println("\nTerminating\n***closed***");
			System.exit(0);
		}
		if(ls.isEmpty() && t1.isEmpty()){
			System.out.println("Both are empty");
			System.out.println("\nTerminating\n***closed***");
			System.exit(0);
		}
		if(t1.size()!=ls.size()){
			System.out.println("Not equal as sizes are different");
			System.exit(0);
		}
		
		
		//Four ways can be used for comparision
		
//1     //using clone and removeAll methods
		/*
		t2=(TreeSet)t1.clone();
		t2.removeAll(ls);
		if(t2.isEmpty()){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}
		*/
		
//2		//using iterator
		
		/*
		Iterator it= t1.iterator();
		while(it.hasNext()){
			a=(int)it.next();
			Iterator ia= ls.iterator();
     		//System.out.println("a=="+a);
			while(ia.hasNext()){
				b=(int)ia.next();
			//System.out.println("b=="+b);
				if(a==b){
					count++;
				}
			}
		}
		if(t1.size()==count){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}
		*/
		count=0;
		
		
//3		//using contains
		
		/*
		Iterator it1= t1.iterator();
		while(it1.hasNext()){
			a=(int)it1.next();
				if(ls.contains(a)){
					count++;
				}
		}
		if(t1.size()==count){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}
		*/



//4		//using containsAll
		
		if(t1.containsAll(ls)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}

	/*	//using ternary operator
	    String result;
		result=t1.containsAll(ls)?("Equal"):("Not equal");
		System.out.println(result);
	*/	
		
	}
}
