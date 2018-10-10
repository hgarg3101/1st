package com.capgemini.threads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("source.txt");
		FileOutputStream fos = new FileOutputStream("target.txt");
		CopyDataThread cd= new CopyDataThread(fis,fos);
		cd.start();
	}


}
