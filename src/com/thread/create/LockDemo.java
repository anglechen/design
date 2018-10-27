package com.thread.create;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		
		Condition notFull = lock.newCondition();
		Condition notEmpty = lock.newCondition();
		
		lock.lock();
		
	
		
		System.out.println("doing .....");
		
		
		lock.unlock();
		
		
		
	}
}
