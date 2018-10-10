package com.capgemini.threads;

public class Reserve implements Runnable{
	int available=1;
	int wanted;
	
	Reserve(int wanted){
		this.wanted=wanted;
	}
	@Override
	public void run() {
		String name= Thread.currentThread().getName();
		synchronized(this){
			if(available>=wanted){
			System.out.println(wanted+" berths alloted to "+ name);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			available-=wanted;
		}
		else{
			System.out.println("Sorry "+name+", "+available+" berths available");
		}
		
	}
		
	}
	
	public static void main(String[] args) {
		Reserve r= new Reserve(1);
		Thread t1 =new Thread(r);
		t1.setName("ramesh");
		t1.start();
		Thread t2 =new Thread(r);
		t2.setName("suresh");
		t2.start();
	}

	

}
