package com.thread.create;

public class MyReentantLockDemo {
	private static MyReentantLock myLock = new MyReentantLock();
	
	public static void main(String[] args) {
		
		operation1();
		
	}
	
	public static void operation1() {
		System.out.println("operation1 is in");
		myLock.lock();
		System.out.println("operation1 get lock");
		
		operation2();
		
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




class MyReentantLock{
	
	private boolean lock = false;
	
	private Thread lockBy = null;
	
	private  int lockCount = 0; 
	
	 public synchronized void lock() {
		 while(lock && lockBy != Thread.currentThread()) {
			 try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 lock = true;
		 lockCount++;
		 lockBy = Thread.currentThread();
		 
	 }
	 
	 
	 public synchronized void unLock() {
		 if(lockBy == Thread.currentThread()) {
			 lock = false;
			 lockCount--;
			 notifyAll();
		 }
		 
	 }
	
	
	
	
	
	
}
