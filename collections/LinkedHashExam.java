package com.capgemini.collections;

import java.util.LinkedHashSet;
import java.util.Iterator;


public class LinkedHashExam {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(2);
		ls.add(45);
		LinkedHashSet ls1 = new LinkedHashSet();
		ls1.add(2);
		ls1.add(45);
		ls1.add(2);
		
		//ls1.containsAll(ls);
		
		System.out.println(ls1.containsAll(ls));

	}

}
