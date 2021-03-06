package com.psl;

class Display {
	//If we are not declaring wish method as synchronized then both thread will be executed simultaneously and hence we will get irregular output.
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning - ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}
}

class MyThreadSyn extends Thread{
	Display d;
	String name;
	public MyThreadSyn(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {

		System.out.println("---- Synchronization Demo ----");
		Display d = new Display();
		MyThreadSyn t1 = new MyThreadSyn(d, "Sudeep");
		MyThreadSyn t2 = new MyThreadSyn(d, "Sandeep");
		
		/*
		Display d1 = new Display();
		Display d2 = new Display();
		MyThreadSyn t1 = new MyThreadSyn(d1, "Sudeep");
		MyThreadSyn t2 = new MyThreadSyn(d2, "Sandeep");
		//we will get irregular output, here no use of synchronization keyword.
		*/
		
		t1.start();
		t2.start();
	}

}
