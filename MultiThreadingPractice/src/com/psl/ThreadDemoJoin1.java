package com.psl;

class MyThreadJoin1 extends Thread {

	static Thread mt;
	
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemoJoin1 {

	public static void main(String[] args) throws InterruptedException {
		MyThreadJoin1.mt = Thread.currentThread();
		MyThreadJoin1 t = new MyThreadJoin1();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(200);
		}

	}

}
