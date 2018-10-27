package com.thread.util;

public class DeadLock {
	
	private static Object a = new Object();
	
	private static  Object b = new Object();
	
	
	public static void main(String[] args) {
		
		new Thread(()->{
			testa();
		}).start();
		
		
		new Thread(()->{
			testb();
		}).start();;
	}
	
	
	public static void testa() {
		synchronized (a) {
			System.out.println("a......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (b) {
				System.out.println("b......");
			}
		}
		
	}
	
	public static void testb() {
		synchronized (b) {
			System.out.println("b......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (a) {
				System.out.println("a......");
			}
		}
		
	}
	
}
