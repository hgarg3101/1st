package com.capgemini.core;

import com.capgemini.interfaces.Inter1;

public class Intertest implements Inter1{
	public static void main(String[] args){
		Intertest obj=new Intertest();
		obj.interdisplay();
		obj.inters();
		System.out.println("Accesing inside main"+Inter1.a);
	}
	public void inters(){
		System.out.println("inters from class Intertest"+Inter1.a);
	}
	public void interdisplay(){
		System.out.println("interdisplay from class Intertest");
		
	}

}
