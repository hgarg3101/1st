package com.capgemini.core;
import java.util.Scanner;
public class WordsOnly {

	public static void main(String[] args) {
		int num,i,j,k,m;
		Scanner s= new Scanner(System.in); //using scanner class for opening input stream
		num=s.nextInt();
		StringBuffer str= new StringBuffer(); //using mutable string
		//arrays defined for storing required strings
		
		String arr[]={"one","two","three","four","five","six","seven","eight","nine"};
		String arr1[]={"eleven","twelve","thirteen","fourteen","fivteen","sixteen","seventeen","eighteen","nineteen"};
		String arr2[]={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		//Conditionals statements to check every case.
		
		if(num<0){
			System.out.println("Number can be positive only");
		}
		
		//string to append according to requirement
		
		else if(num%10==0){    //conditions for multiples of 10
			if(num<100){
				i=num/10;
				str.append(arr2[i-1]);	
			}
			else{
				i=num/100;
				str.append(arr[i-1]+" hundred ");	
			}
				i=num/100;
			
		}
		else if(num<10){
			str.append(arr[num-1]);	
		}
		else if (num<20){
			i=num%10;
			str.append(arr1[i-1]);	
		}
		else if(num<100){
			i=num%10;
			j=(num-i)/10;
			str.append(arr2[j-1]+" "+arr[i-1]);	
		}
		else if(num<1000){ //num=867
			i=num%10; //7
			j=(num-i)/10;
			k=j%10; //6
			m=(num-i-(k*10))/100; //8
			str.append(arr[m-1]+" hundred and "+arr2[k-1]+" "+arr[i-1]);	
		}
		
		// if number is greater than 1000
		else{
			System.out.println("Number too big!! \n Too big (That's what she said)!!!");
			System.exit(0);
		}
		System.out.println(str+" only!!");
		s.close(); //closing input stream
	}
}