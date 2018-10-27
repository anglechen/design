package com.thread.create;

public class ThreadSychorinezed {
	public static void main(String[] args) {
		SynchronizedClass sc = new SynchronizedClass();
		new Thread(()->{
			for (int i = 0; i < 20; i++) {
				try {
					sc.sub(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		for (int i = 0; i < 20; i++) {
			try {
				sc.main(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}


class SynchronizedClass{
	
	private boolean isMain = false;
	
	public synchronized void sub(int i) throws InterruptedException {
		while(isMain) {
			wait();
		}
		for (int j = 0; j < 10; j++) {
			Thread.sleep(100);
			System.out.println("sub===第:" +i +"次循环，其中的第：" + j +"次");
		}
		
		isMain = true;
		notifyAll();
	}
	
	
	public synchronized void main(int i) throws InterruptedException {
		while(!isMain) {
			wait();
		}
		for (int j = 0; j < 5; j++) {
			Thread.sleep(50);
			System.out.println("main===第:" +i +"次循环，其中的第：" + j +"次");
		}
		isMain = false;
		notifyAll();
	}
	
	
	
}