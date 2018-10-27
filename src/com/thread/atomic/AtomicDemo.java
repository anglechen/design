package com.thread.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * 原子更新对象的属性
 * @author Administrator
 *
 */
public class AtomicDemo {
	private People p1 = new People();
	AtomicIntegerFieldUpdater atmoicAge = 
			AtomicIntegerFieldUpdater.newUpdater(People.class, "age");
	private void incremet() {
//		p1.setAge(p1.getAge() + 1);
		atmoicAge.incrementAndGet(p1);
	}
	
	
	public static void main(String[] args) {
		AtomicDemo ad = new AtomicDemo();
		for (int i = 0; i <10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int j = 0; j < 1000; j++) {
						ad.incremet();
					}
					
				}
			}).start();
			
		}
		
		while(Thread.activeCount() > 1)Thread.yield();
		System.out.println(ad.p1.getAge());
	}
}
