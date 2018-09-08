package com.test.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionTest {
//	new ArrayList<>(); 
	public static List lists = new Vector();
	
	/*{
		System.out.println("构造块");
	}
	*/
	
	static {
		for(int i = 1 ; i<= 100;i++) {
			lists.add("火车票"+ i);
		}
	}
	
	/*public CollectionTest() {
		System.out.println("构造方法");
	}*/
	
	public  static void sales() {
			
			String name = Thread.currentThread().getName();
			System.out.println(name+"卖出火车票：" + lists.remove(0));
			

		
	}
	
	
	public static void main(String[] args) {
		for(int i = 0 ;i<5; i++) {
			Thread t1 = new Thread1();
			t1.start();
		}
		for(int i = 0 ;i<5; i++) {
			Thread t2 = new Thread(new Thread2());
			t2.start();
		}
		
	}
}
