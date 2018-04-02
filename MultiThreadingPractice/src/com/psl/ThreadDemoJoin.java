package com.psl;

class MyThreadJoin extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemoJoin {

	public static void main(String[] args) throws InterruptedException {

		MyThreadJoin t = new MyThreadJoin();
		t.start();
		t.join(10000);
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
