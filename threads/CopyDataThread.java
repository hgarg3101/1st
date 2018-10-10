package com.capgemini.threads;
import java.io.*;

public class CopyDataThread extends Thread{
	private FileInputStream fis;
	private FileOutputStream fos;
	CopyDataThread(FileInputStream fis1,FileOutputStream fos1){
		this.fis=fis1;
		this.fos=fos1;
		
	}
	@Override
	public void run() {
		try{
		int ch,count=0;
		while((ch=fis.read()) != -1){
			if(count%10==0){
				System.out.println("10 charcters are copied");
				System.out.println("5 sec delay");
				Thread.sleep(5000);
			}
			fos.write(ch);
			count++;
		}
		System.out.println("Copying done");
		fis.close();
		fos.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
