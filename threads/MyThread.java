package com.capgemini.threads;

//two methods for creating thread
//1 extending Thread class
//2 Implementing runnable interfaces

/*
 * step1: create custom, class that extends thread class

step2: Override run method of thread class

public void run(){
	
}

step3: create an object

step4: execute run method as a thread
*/


/*public class MyThread extends Thread {
	public void run(){
		System.out.println("Custome thread: MyThread");
	}

	public static void main(String[] args) {
		MyThread mt= new MyThread();
		mt.start();

	}

}
*/



//2

public class MyThread implements Runnable {
	
	public void run(){
	/*try{*/
		for(int i=0; i<10;i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
			//System.out.println("Custome thread using runnable: MyThread: "+Thread.currentThread().getName());
			
		/*	Thread.sleep(1000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}*/
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread mt= new MyThread();
		Thread t = new Thread(mt);
		t.setName("thread1");
		t.start();
		t.join();
		Thread t2 =new Thread(mt);
		t2.setName("thread2");
		t2.start();
		for(int i=0; i<10;i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}