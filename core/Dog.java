package com.capgemini.core;

class Base {
	public void callme() {
		System.out.println("inside call me method!");
		Dog co = new Dog();
		co.bark();
	}

}

public class Dog {
	private boolean live = true;

	public void bark() {
		if (live) {
			System.out.println("bow ow!!");
		}
	}

	public static void main(String[] args) {
		Dog zo = new Dog();
		zo.bark();
		Base bo = new Base();
		bo.callme();
	}
}