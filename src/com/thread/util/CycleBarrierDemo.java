package com.thread.util;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CycleBarrierDemo {
	public static void main(String[] args) {
		CyclicBarrier cyclic = new CyclicBarrier(100);
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				try {
					
					System.out.println(Thread.currentThread().getName() +":已到达屏障点:time:"+System.currentTimeMillis());
					cyclic.await();
					Thread.sleep(new Random().nextInt(100));
					System.out.println(Thread.currentThread().getName() +":woring done");
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}).start();
		}
	}
}
