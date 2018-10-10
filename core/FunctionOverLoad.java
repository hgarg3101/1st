package com.capgemini.core;

public class FunctionOverLoad {
	public void readme(){
		System.out.println("Readme void public");
	}
	int readme(Float a,int b, Integer c[]){
		System.out.println("Readme int  3 para default");
		return 1;
	}
	protected int readme(int...a){
		System.out.println("Readme var arg proetected");
		return a.length;
	}
	private int readme(int a,int b){
		System.out.println("Readme void private");
		return 2;
	}
	
	public static void main(String...a){
		FunctionOverLoad obj= new FunctionOverLoad();
		System.out.println(obj.readme(new Integer(2),new Integer(4),new Integer(6)));
	}
	
	

}
