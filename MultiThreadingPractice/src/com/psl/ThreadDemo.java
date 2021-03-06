package com.psl;

class MyThread extends Thread{
	
	public void run() {
		for(int i=0 ; i<10 ; i++){
			//executed by child thread
			System.out.println("Child Thread");
		}
	}
}

class MyThread1 extends Thread{
	
	public void run() {
			System.out.println("no - arg run");
	}
	
	public void run(int i) {
			System.out.println(" int - arg run");
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println("Thread Demo");
		//MyThread t = new MyThread(); //Thread initialization
		MyThread1 t = new MyThread1();
		t.start();
		
		
		for(int i=0 ; i<10 ; i++){
			//executed by main thread
			System.out.println("Main Thread");
		}
		
		System.out.println("====================");

		System.out.println(Thread.currentThread().getName());
		
		System.out.println(t.getName());
		
		Thread.currentThread().setName("Sudeep");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("====================");
				
	}

}
