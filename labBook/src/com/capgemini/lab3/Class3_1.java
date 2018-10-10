package com.capgemini.lab3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Class3_1 {
	
	String custom(String str){
		Integer choice;
		StringBuffer sb =new StringBuffer(str) ;
		StringBuffer res =new StringBuffer() ;
		Scanner s= new Scanner(System.in);
		System.out.println("Input Your choice:");
		System.out.println("1) Add the String to itself");
		System.out.println("2) Replace odd positions with #");
		System.out.println("3) Remove duplicate characters in the String");
		System.out.println("4) Change odd characters to upper case");
		choice=s.nextInt();
		switch(choice){
		case 1:{
			sb.append(sb);
			res.append(sb.toString());
			break;
		}
		case 2:{
			int odd=0;
			while(odd<sb.length()){
				if(odd%2==0)
				sb.replace(odd,odd+1,"#");
				odd++;
			}
			res.append(sb.toString());
			break;
		}
		case 3:{
			char[] arr = sb.toString().toCharArray();
			Set set = new HashSet();
			for(Character c: arr){
				if(!set.contains(c)){
					set.add(c);
					res.append(c);
				}
			}
			break;
		}
		case 4:{
			char[] arr= sb.toString().toCharArray();
			int i=0;
			for(Character c: arr){
				{
					if(i%2==0){
						res.append(c.toString().toUpperCase());
					}
					else
						res.append(c);
					
					i++;
				}
				
			}
			break;
		}
		default:{
			System.out.println("Wrong input");
			System.exit(0);
		}
		}
		
		s.close();
		return res.toString();
		
	}

	public static void main(String[] args) {
		String str="test string";
		Class3_1 obj=new Class3_1();
		
		
		System.out.println(obj.custom(str));

	}

}
