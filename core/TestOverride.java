package com.capgemini.core;

class Parent{
	public void display(int a){
		System.out.println("Method of parent");
	}
}
class Child extends Parent{
	public void display(char a){
		System.out.println("Method of child");
		//super.display(4);  //will call method of parent
	} 
}
public class TestOverride {
	public static void main(String...a){
		//Parent objp=new Parent();
		Parent objc=new Child();  //overriding
		//objp.display(4);
		objc.display((char)6);
	}

}
