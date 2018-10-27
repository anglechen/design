package com.thread.create;

import java.util.Random;

public class ThreadLocalTest {
	private static ThreadLocal<Integer> tl = new ThreadLocal(); 
	
	public static void main(String[] args) {
		tl.set(0);
		
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				tl.set(new Random().nextInt(100));
				System.out.println(Thread.currentThread().getName() + ":" + tl.get());
			}).start();
		}
		
		while(Thread.activeCount() > 1)Thread.yield();
		System.out.println("result==="+ tl.get());
		
	}
	
	
	
	
	
	
	
	
	
}
