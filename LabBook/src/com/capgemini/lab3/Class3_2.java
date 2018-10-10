package com.capgemini.lab3;

public class Class3_2 {
	boolean checkString(String str){
		boolean res=true;
		char[] arr = str.toCharArray();
		int max=0,count=0;
		max=arr[0];
		for(char c: arr){
			if(max>(int)c){
				count++;
			}
			max=(int)c;
		}
		if(count>0)
			res=false;
		return res;
	}
	public static void main(String[] args) {
		String str="ABCA";
		Class3_2 obj=new Class3_2();
		if(obj.checkString(str)){
			System.out.println("Positive String");
		}
		else
			System.out.println("Negative String");
		

	}

}
