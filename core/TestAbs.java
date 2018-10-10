package com.capgemini.core;

import com.capgemini.abstracts.AbsClass1;

public class TestAbs extends AbsClass1{
	
	public void display(){
		System.out.println("Called from Absclass1 display");
	}

	public static void main(String[] args) {
		TestAbs abs=new TestAbs();
		abs.display();
		abs.callme();
		// TODO Auto-generated method stub

	}

}
