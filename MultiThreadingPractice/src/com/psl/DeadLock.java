package com.psl;

class A{
	
	public synchronized void d1(B b){
		System.out.println("Thread 1 start execution of d1(B b) method ");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 trying to call B's last ");
		b.last();
	}
	
	public synchronized void last(){
		System.out.println("Inside A last method ");
	}
	
}

class B{

	public synchronized void d2(A a){
		System.out.println("Thread 2 start execution of d2(A a) method ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 2 trying to call A's last ");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B last method ");
	}
	
}

public class DeadLock extends Thread{

	A a = new A();
	B b = new B();
	
	public void m1(){
		this.start();
		a.d1(b);//This line executed by main thread
	}
	
	public void run(){
		b.d2(a);//This line executed by child thread
	}
	
	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		d.m1();
	}

}
