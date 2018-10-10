package com.capgemini.core;
import java.io.*;
public class DeserializableEmployee{

	public static void main(String[] args)  throws IOException, ClassNotFoundException {
		FileInputStream fis= new FileInputStream("emp.txt");
		//read state of an object from a file
		ObjectInputStream ois= new ObjectInputStream(fis);
		Employee e= (Employee)ois.readObject();
		System.out.println(e);
		fis.close();
		ois.close();
	}
}
