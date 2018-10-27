package com.thread.create;

public class MyLockDemo {
	private static MyLock myLock = new MyLock();
	
	public static void main(String[] args) {
		
		new Thread(()->{
			operation1();
		}).start();;
		
		new Thread(()->{
			operation2();
		}).start();;
		
		
	}
	
	public static void operation1() {
		System.out.println("operation1 is in");
		myLock.lock();
		System.out.println("operation1 get lock");
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("operation1 doing.....");
		myLock.unLock();
		System.out.println("operation1 is done");
	}
	
	public static void operation2() {
		System.out.println("operation2 is in");
		myLock.lock();
		System.out.println("operation2 get lock");
		System.out.println("operation2 doing.....");
		myLock.unLock();
		System.out.println("operation2 is done");
	}


}




class MyLock{
	
	private boolean lock = false;
	
	 public synchronized void lock() {
		 while(lock) {
			 try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 lock = true;
		 
	 }
	 
	 
	 public synchronized void unLock() {
		 lock = false;
		 notifyAll();
	 }
	
	
	
	
	
	
}
