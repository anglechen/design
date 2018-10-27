package com.thread.create;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {

	public static void main(String[] args) {
		VolatileOperation vo = new VolatileOperation();	
		for (int i = 0; i < 10; i++) {
				new Thread(()->{
					vo.increament();
				}).start();
		}
		
		while(Thread.activeCount() > 1)Thread.yield();
		System.out.println("ressult:" + VolatileOperation.count+"====" + VolatileOperation.count2);
	}

}

class VolatileOperation{
	public static volatile int count = 0;
	public static AtomicInteger count2 = new AtomicInteger(0);
	
	public  void increament() {
		for (int i = 0; i < 1000; i++) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			count++;
			count2.incrementAndGet();
		}
		
	}
}
