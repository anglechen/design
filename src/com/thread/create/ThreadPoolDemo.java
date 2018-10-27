package com.thread.create;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {
//		cache();
//		fix();
		sechedual();
		
	}
	
	
	public static void cache() {
		ExecutorService execu1 = Executors.newCachedThreadPool();
		
		Operation operation = new Operation();
		for (int i = 0; i < 10; i++) {
			execu1.execute(()->{
				operation.test();
			});
		}
	}
	
	public static void fix() {
		ExecutorService execu1 = Executors.newFixedThreadPool(3);
		Operation operation = new Operation();
		for (int i = 0; i < 10; i++) {
			execu1.execute(()->{
				operation.test();
			});
		}
	}
	
	public static void sechedual() {
		ScheduledExecutorService execu1 = Executors.newScheduledThreadPool(3);
		Operation operation = new Operation();
//		for (int i = 0; i < 10; i++) {
//			execu1.schedule(new Runnable() {
//				
//				@Override
//				public void run() {
//					operation.test();
//					
//				}
//			}, 5, TimeUnit.SECONDS);
			execu1.scheduleAtFixedRate(new Runnable() {
				
				@Override
				public void run() {
					operation.test2();
					
				}
			}, 1, 1, TimeUnit.SECONDS);
		}
//	}
	
	
	

}



class Operation{
	
	public void test() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +":" + i);
		}
	}
	
	
	public void test2() {
		System.out.println(Thread.currentThread().getName());
	}
	
}










