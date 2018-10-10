package com.capgemini.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList ls= new ArrayList();
		ArrayList ls1= new ArrayList();
		
		Integer a[]= new Integer[]{11,22,33,44,6667,8,8,9,0,90};
		System.out.println("Array size"+a.length);
		ls.addAll(Arrays.asList(a));
		
		
		System.out.println("Size: "+ls.size());
		ls.add(new Integer(12));
		ls.add("kolaparthi");
		ls.add("harshit");
		ls.add(3.5678f);

		ls1.add(new Integer(2));
		ls1=(ArrayList)(ls.clone());
		
		
		
		
		
		System.out.println("After adding Size: "+ls.size());
		System.out.println("Elements are"+ls.hashCode());
		System.out.println("Elements are ls:"+ls);
		
		System.out.println("Elements are ls1:"+ls1);
		System.out.println(ls.remove(0));
		System.out.println("Elements are ls:"+ls);
		Integer aa=(Integer) ls1.get(0);
		System.out.println(aa);
		
		
		Iterator r=ls.iterator();
		while(r.hasNext()){
			
			System.out.println(r.next());
			r.remove();
			
		}
		
		
		
	}

}
