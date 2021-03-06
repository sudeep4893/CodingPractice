package com.psl;

class MyDaemonThread extends Thread{
	public void run(){
		for(int i=0 ; i<10 ; i++){
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DaemonExample {

	public static void main(String[] args) {
/*
		System.out.println(Thread.currentThread().isDaemon()); //false
		
		//Thread.currentThread().setDaemon(true);   //getting exception : java.lang.IllegalThreadStateException
		
		MyDaemonThread t = new MyDaemonThread();
		System.out.println(t.isDaemon()); //false
		
		t.setDaemon(true);
		System.out.println(t.isDaemon()); //true
		
		*/
		
		MyDaemonThread t = new MyDaemonThread();
		t.setDaemon(true);
		t.start();
		System.out.println("End of main Thread");
		
	}

}
