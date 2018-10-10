package com.capgemini.collections;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeMapExam {

	public static void main(String[] args) {
		TreeMap tm= new TreeMap();
		//TreeMap.put(key,value);
		tm.put(1, "value");
		tm.put(1, "values");
	//	tm.put(null, "values");
		//hm.put(null, "valu");
		tm.put(7, null);
		
		tm.put(4, "values");
		tm.put(6,"abc");
		tm.put(0,67);
		tm.put(0,68);
		tm.put(9,8);
		tm.put(5,8);
		tm.put(10,8);
		tm.put(11,5.6);
		tm.put(12,"\n");
		tm.put(13,"last");
		
	//	hm.put(1/0,8); //will throw Arithmetic exception
	//	tm.put("\n",8);   //will throw class cast exception as treemap use comparator	
		Set ts=tm.entrySet();
		
		Iterator i=ts.iterator();
		System.out.println("Printing using iterator\n");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		//ts.add(23); will throw unsupported operation exception
		System.out.println("\nPrinting using methods\n");
		System.out.println("TreeMap object= "+tm);
		System.out.println("Size of TreeMap object= "+tm.size());
		
		System.out.println("Set object= "+ts);
		System.out.println("Size of Set object= "+ts.size());
		
		System.out.println( tm.containsKey(9));
		System.out.println( tm.get(9));
		System.out.println("keyset()= "+ tm.keySet());
		System.out.println("values()= "+tm.values());
		
		
	}
}
