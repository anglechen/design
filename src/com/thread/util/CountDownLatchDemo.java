package com.thread.util;

import java.util.concurrent.CountDownLatch;
/**
 * CountDownLatch允许一个或多个线程等待直到在其他
 * 线程中执行的一组操作完成的同步辅助
 * A CountDownLatch用给定的计数初始化。 
 * await方法阻塞，直到由于countDown()方法的调用而导致当前计数达到零，
 * 之后所有等待线程被释放，并且任何后续的await 调用立即返回。
 *  这是一个一次性的现象 - 计数无法重置。 如果您需要重置计数的版本，
 *  请考虑使用CyclicBarrier 。
 * @author Administrator
 *
 */
public class CountDownLatchDemo {

	public static void main(String[] args) {
		//例如司机要等100人到齐后才开车
		CountDownLatch countDown = new CountDownLatch(100);
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				synchronized (countDown) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "做完了....；还有没来的人数：" +countDown.getCount());
					countDown.countDown();
				}
				
				
			}).start();
		}
		try {
			countDown.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("人都到齐了，我们出发了.........");
	}

}
