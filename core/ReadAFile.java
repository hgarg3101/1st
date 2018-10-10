package com.capgemini.core;

import java.io.*;

public class ReadAFile {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis= new FileInputStream("sample.txt"); //if want to append FileOutputStream("sample.txt",true);
		int ch;
		while((ch=fis.read())!=-1){
			System.out.print((char)ch);
		}
		fis.close();

	}

}
