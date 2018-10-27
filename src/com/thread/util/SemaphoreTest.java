package com.thread.util;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		for (int i = 0; i < 10; i++) {
			new Thread(()->{
				try {
					semaphore.acquire();
					System.out.println(Thread.currentThread().getName() +" is doing...");
					Thread.sleep(2000);
					semaphore.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				
			}).start();
		}
	}

}
