package com.psl;

class MyThread extends Thread{
	
	public void run() {
		for(int i=0 ; i<10 ; i++){
			//executed by child thread
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println("Thread Demo");
		MyThread t = new MyThread(); //Thread initialization
		t.start();
		for(int i=0 ; i<10 ; i++){
			//executed by main thread
			System.out.println("Main Thread");
		}
		
	}

}
