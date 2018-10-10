package com.capgemini.core;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos= new FileOutputStream("sample.txt",true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Buffer reader activating");
		StringBuffer sb= new StringBuffer("");
		String s= null;
		while((s=br.readLine())!=""){
			sb.append(s);
			
		}
		fos.write(s.getBytes());
		
		System.out.println("Entered using buffer: "+ s);
		//problem with scanner
		System.out.println("Scanner activating");
		Scanner sc= new Scanner(System.in) ;
		String name = sc.next();
		System.out.println("Entered using scanner: "+ name);
		
		
		fos.close();

	}

}
