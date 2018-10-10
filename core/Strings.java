package com.capgemini.core;

public class Strings {

	public static void main(String[] args) {
		String s="test string";
	StringBuffer bufobj= new StringBuffer(s);
	int p,q;
	p=bufobj.length();
	q=bufobj.capacity();
	System.out.println("Length of String: "+p);
	System.out.println("Capacity of String: "+q);
	bufobj.append(" appended string");
	p=bufobj.length();
	q=bufobj.capacity();
	System.out.println("Length of Appened String: "+p);
	System.out.println("Capacity of Appened String: "+q);
	bufobj.append(" more string");
	p=bufobj.length();
	q=bufobj.capacity();
	System.out.println("Length of More Appened String: "+p);
	System.out.println("Capacity of More Appened String: "+q);
	System.out.println(bufobj.charAt(2));
	System.out.println(bufobj.reverse());
	bufobj.reverse();
	System.out.println(bufobj.insert(4," insert"));
	//System.out.println(bufobj);
	

	}

}
