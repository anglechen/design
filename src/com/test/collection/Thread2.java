package com.test.collection;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		/*要做的事情*/
		while(true) {
			if(CollectionTest.lists.size() <=0)break;
			CollectionTest.sales();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
