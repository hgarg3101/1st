package com.capgemini.core;
import java.io.*;
import java.util.Scanner;
public class File_8_2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("numbers.txt");
		String s="0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10";
		fos.write(s.getBytes());
		String[] arr;
		int i;
		Scanner sc= new Scanner(new File("numbers.txt"));
		System.out.println("Only even numbers: ");
		while(sc.hasNext()){
			arr=sc.next().split(",");
			i=Integer.valueOf(arr[0]);
			if(i%2==0 && i!=0){
			System.out.println(arr[0]);
			}
		}
		sc.close();
		fos.close();

	}

}
