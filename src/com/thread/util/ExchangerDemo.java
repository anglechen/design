package com.thread.util;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExchangerDemo {

	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger();
		new Thread(()->{
			System.out.println("我是刘备....");
			try {
				String zf = exchanger.exchange("弟弟你终于回来了，大哥我很担心啊",1,TimeUnit.SECONDS);
				System.out.println("张飞说：" + zf);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				e.printStackTrace();
				System.out.println("还不来，老子不等你了。。。");
			}
		}).start();
		
		new Thread(()->{
			System.out.println("我是张飞....");
			String lb;
			try {
				TimeUnit.SECONDS.sleep(4);
				lb = exchanger.exchange("哥哥我回来了...");
				System.out.println("刘备说：" + lb);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}).start();
		
	}

}
