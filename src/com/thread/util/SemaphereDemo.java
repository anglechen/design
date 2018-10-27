package com.thread.util;

import java.util.concurrent.Semaphore;

/**
 * 信号量:我们一般使用信号量来限制访问资源的线程数量
 * 例如：停车场有100个位置，有1000辆车要停，进去一辆要发一个许可，出来要回收许可（就好像显示停车位）
 * @author Administrator
 *
 */
public class SemaphereDemo {

	public static void main(String[] args) {
		//默认非公平
		Semaphore sema = new Semaphore(1);
		
		Semaphore sema2 = new Semaphore(1,true);
		for (int i = 0; i < 10; i++) {
//			new RunOnPlayGround(sema).start();
			new RunOnPlayGround(sema2).start();
		}
		
	}

}

class RunOnPlayGround extends Thread{
	
	private Semaphore semaphore ;
	
	public RunOnPlayGround(Semaphore semaphore){
		this.semaphore = semaphore;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "--还有许可的数量：" + semaphore.availablePermits());
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()+"is working");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+"has worked" );
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
