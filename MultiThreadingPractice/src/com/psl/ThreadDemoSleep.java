package com.psl;

class MyThreadSleep extends Thread{
	public void run(){
		for(int i=0 ; i<=50 ; i++){
			System.out.println("I am lazy thread - " + i);
		}
		System.out.println("I am entering into Sleeping state ...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("I got interrupted .. .. ..");
		}
	}
}

public class ThreadDemoSleep {

	public static void main(String[] args) {

		MyThreadSleep t = new MyThreadSleep();
		t.start();
		t.interrupt();
		System.out.println("End of Main thread");
		
	}

}
