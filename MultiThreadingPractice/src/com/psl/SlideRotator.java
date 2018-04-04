package com.psl;

class MyThreadSlide extends Thread {

	public void run() {

		try {

			for (int i = 0; i < 10; i++) {
				System.out.println("I am Lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("I got interrupted .... ");
		}

	}

}

public class SlideRotator {

	public static void main(String[] args) throws InterruptedException {

		MyThreadSlide t = new MyThreadSlide();
		t.start();
		t.interrupt(); //--Line 1
		System.out.println("End of Main Thread");

		/*for (int i = 0; i <= 10; i++) {
			System.out.println("Slide " + " - " + i);
			Thread.sleep(2000);
		}*/

	}

}
