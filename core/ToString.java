package com.capgemini.core;

public class ToString {
	
	String name;
	int age;
	
	ToString(){    //constructor
		name="test";
		age=90;
		
	}
	
	public String toString(){
		String str= "Name="+name+", Age="+age;
		return str;
	}
	
	public static void main(String[] args) {
		
		
	//Integer part
	
		int a=50;   //int is primitive datatype
		Integer a1=66; //can also be used
		String str =Integer.toString(a);
		System.out.println("Using String str =Integer.toString(a); Str= "+str);
		
		//Alternative
		Integer obj= new Integer(a);
		String str1 =obj.toString();
		System.out.println("Using 	String str1 =obj.toString(); Str= "+str1);
		
		//Another if Integer a =50;
		System.out.println(a1.toString());
		
	//Float part
		
		float f=50; //float is primitive datatype
		Float f1=50.6f;  //can also be used
		String str3 =Float.toString(f);
		System.out.println("Using String str3 =Float.toString(f); Str= "+str3);
		
		//Alternative
		Float obj2= new Float(f);
		String str4 =obj2.toString();
		System.out.println("Using String str4 =obj2.toString();Str= "+str4);
		
		
		//Another if Float a =50;
		System.out.println(f1.toString());
				
	//Object part
		ToString strobj=new ToString();
		System.out.println(strobj.toString());
		System.out.println("Without using toString: "+strobj);

	}

}
