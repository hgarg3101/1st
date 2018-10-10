package com.capgemini.collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
	//	ArrayList ls1= new ArrayList();
		
		Integer a[]= new Integer[]{11,22,33,44,6667,8,8,9,0,90};
		System.out.println("Array size"+a.length);
		//hs.addAll(Arrays.asList(a));
		
		
		System.out.println("Size: hash   "+hs.size());
		//hs.add(new Integer(12));
	//	hs.add("kolaparthi");
		//hs.add("harshit");
		//hs.add(3.5678f);

	//	ls1.add(new Integer(2));
		//ls1=(ArrayList)(ls.clone());
		
		
		hs.add('a');
		hs.add(3);
		hs.add(3);
		
		hs.add("ABC");
		//hs.add(1/0);
		
		hs.add(null);
		hs.add("B");
		hs.add("\n   test");
		
		
		System.out.println("After adding Size: "+hs.size());
		System.out.println("Elements are "+hs.hashCode());
		System.out.println("Elements are hs:"+hs);
		
	//	System.out.println("Elements are ls1:"+ls1);
		System.out.println(hs.remove(0));
	//	System.out.println("Elements are hs:"+hs);
	//	Integer aa=(Integer) ls1.get(0);
	//	System.out.println(aa);
		
		Iterator r=hs.iterator();
		while(r.hasNext()){
			
			System.out.println(r.next());
			r.remove();
			
		}
		
		
		
		
		
		
	}

}
