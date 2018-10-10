package com.capgemini.core;

import java.io.*;

public class ReadWriteAFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("sample.txt");
		FileOutputStream fos = new FileOutputStream("sampletest.txt");
		//reading and writing from same file will put infintie loop
		Integer ch;
		while((ch=fis.read())!=-1){
			System.out.print((char)(ch.intValue()));
			fos.write((char)(ch.intValue()));
		}
		fis.close();
		fos.close();

	}

}
