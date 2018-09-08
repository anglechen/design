package com.test.collection;

public class Thread1 extends Thread {

	@Override
	public void run() {
		/*要做的事情*/
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			CollectionTest.sales();
		}
		
	}
	
	
}
