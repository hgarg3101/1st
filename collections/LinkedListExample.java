package com.capgemini.collections;
import java.util.LinkedList;


public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		l1.add(new Integer(2));
		l1.addFirst("test");
		System.out.println(l1.add(new Integer(2)));
		l1.offer("test offer");
		l1.offerLast("testOfferlast");
		l1.add(null);
		l1.add(null);
		l1.add(0);
		String a = null;
		System.out.println(l1);
		l1.push(new Integer(2));
		System.out.println(l1);	}

}
