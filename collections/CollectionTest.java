package com.capgemini.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		ArrayList ls= new ArrayList();
		for(int i=890;i<=1050;i++)
			ls.add(i);
		Iterator r=ls.iterator();
		while(r.hasNext()){
			System.out.println(r.next());
			
		}
		

	}

}
