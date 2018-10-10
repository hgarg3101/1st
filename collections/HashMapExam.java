package com.capgemini.collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;
public class HashMapExam {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		//HashMap.put(key,value);
		hm.put(1, "value");
		hm.put(1, "values");
		hm.put(null, "values");
		//hm.put(null, "valu");
		hm.put(7, null);
		
		hm.put("key", "values");
		hm.put("abc","abc");
		hm.put(0,67);
		hm.put(0,68);
		hm.put("key",8);
		hm.put(8.7,8);
		hm.put(true,8);
	//	hm.put(1/0,8); //will throw Arithmetic exception
		hm.put("\n",8);
		hm.put(5.6f,8);
		
		Set ts=hm.entrySet();
		Iterator i=ts.iterator();
		System.out.println("Printing using iterator");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		//ts.add(23); will throw unsupported operation exception
		System.out.println("HashMap object= "+hm);
		System.out.println("Size of HashMap object= "+hm.size());
		
		System.out.println("Set object= "+ts);
		System.out.println("Size of Set object= "+ts.size());
		
		System.out.println( hm.containsKey(9));
		System.out.println( hm.get(9));
		System.out.println("keyset()= "+ hm.keySet());
		System.out.println("values()= "+hm.values());
		
	}
}
