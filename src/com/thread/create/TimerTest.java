package com.thread.create;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) {
		Timer timer = new Timer();
		System.out.println("main is runing....");
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("timer is running....");
				
			}
		}, 1000);
	}

}
