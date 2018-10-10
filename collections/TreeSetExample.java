package com.capgemini.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> t1= new TreeSet<String>();
		TreeSet<Integer> t2= new TreeSet<Integer>();
		
		
		ArrayList ls= new ArrayList();
		
		Integer a[]= new Integer[]{11,22,33,44,6667,8,8,9,0,90};
		
		ls.addAll(Arrays.asList(a));
		
	
		t1.add("a");
		t1.add("3");
		t1.add("3");
		
		t1.add("ABC");
		t1.add("1/0");
		
		t1.add("A");
		t1.add("B");
		t1.add("\n   test");
		
		
		t2.add(new Integer(5));
		
		Iterator itr =t1.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//System.out.println(t1.descendingSet());
		
		
		System.out.println(t1.ceiling("\t"));
	}

}
