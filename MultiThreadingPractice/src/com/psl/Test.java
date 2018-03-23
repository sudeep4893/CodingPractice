package com.psl;

public class Test {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(1);
		t.start();
		for(int i = 0 ; i<10 ; i++){
			System.out.println("Main Thread");
		}
	}

}
