package com.test.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TreadTest {
	
	private  static List lists = new ArrayList<>();
	 
	public synchronized static void sales() {
		if(lists.size() > 0 ) {
			System.out.println(Thread.currentThread().getName()+"----"+lists.remove(0));
		}else {
			System.out.println("卖完了");
		}
		
	}
	
	
	public static  void testSales() {
		for(int i = 0; i<100; i++) {
			lists.add("火车票" + i);
		}
		
		for(int i = 0; i< 10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					while(true) {
						if(lists.size()<=0)break;
						sales();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}).start();
			
		}
		
		
		
	
		
	}
	
	public static void main(String[] args) {
		
		
		testSales();
	}
}
