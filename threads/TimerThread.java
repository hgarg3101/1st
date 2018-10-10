package com.capgemini.threads;

import java.util.Calendar;
import java.text.*;

public class TimerThread implements Runnable {

	public static void main(String[] args) {
		TimerThread th= new TimerThread();
		Thread t = new Thread(th);
		t.start();
	}

	@Override
	public void run() {
		try{
			int i=10;
			while(true){
		DateFormat df= new SimpleDateFormat("hh:mm:ss");
		Calendar c= Calendar.getInstance();
		String s=df.format(c.getTime());
		if(i==10){
			System.out.print("Now: ");
		}
		System.out.println("Time is "+ s );
		System.out.print("After "+i+" Seconds: ");
		Thread.sleep(10000);
		i+=10;
			}
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
