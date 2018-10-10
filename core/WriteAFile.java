package com.capgemini.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteAFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos= new FileOutputStream("sample.txt",true); //if want to append FileOutputStream("sample.txt",true);
		//FileNotFoundException compile time exception (checked exception) 
		String s= "text after backspace chaarcter";
		fos.write(s.getBytes());
		//FileOutputStream fos1= new FileOutputStream("sample.txt"); 
		//fos.write(s.getBytes());   
		fos.close();
	//	fos1.close();
	
		
	}

}
