package com.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadCreateDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
//		CallableThread callable = new CallableThread();
//		FutureTask future = new FutureTask(callable);
//		Thread t1 = new Thread(future);
//		Thread t2 = new Thread(future);
//		t1.start();
//		t2.start();
//		System.out.println(future.get());
//		t1.join();
//		Thread.sleep(1000);
//		System.out.println("==" + Thread.activeCount());
//		while(Thread.activeCount() > 1) Thread.yield();
//		System.out.println("main is over");
		
		
		
		//demond
		Thread t3 = new Thread(new RunableThread());
		t3.setDaemon(true);
		t3.start();
		Thread.sleep(1000);
		System.out.println("main is over ....");
		
		
	}

}


class CallableThread implements Callable{
	@Override
	public Object call() throws Exception {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}
		return "success";
	}
}

class RunableThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
}



















