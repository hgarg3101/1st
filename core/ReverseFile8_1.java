package com.capgemini.core;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
//import java.io.Reader;

public class ReverseFile8_1 {

	public static void main(String[] args) throws IOException {
		
	/*	FileOutputStream fs = new FileOutputStream("reverse_text.txt");
		StringBuffer s= new StringBuffer("Original: Text for reverse program 'DAD MOM'");
		StringBuffer s1= new StringBuffer(":txet esrever--");
		fs.write(s.toString().getBytes());
		s1=s1.reverse();
		s1 .append(s.reverse());
		fs.write(s1.toString().getBytes());
		fs.close();*/
	//	Reader r = new FileReader("reverse_text.txt");
		int ch;
		String str="test string test";
		FileWriter fw = new FileWriter("practice.txt");
		fw.write(str);
		fw.close();
		FileReader fr = new FileReader("practice.txt");
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}

		fr.close();
	}

}
