package com.test.refrencetest;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class RefreceTest {
	
	public static void main(String[] args) {
//		strong();
//		soft();
//		weak();
		phantom();
	}
	/*强引用*/
	public static void strong() {
		List list = new ArrayList<>();
		for(int i = 0; i< 5; i++) {
			byte[] temp = new byte[1024 * 1024 * 5];
			System.out.println(i);
			list.add(temp);
		}
	
	}
	
	
	/*软引用*/
	public static void soft() {
		List list = new ArrayList<>();
		for(int i = 0; i< 10; i++) {
			byte[] temp = new byte[1024 * 1024 * 5];
			SoftReference soft = new SoftReference(temp);
			System.out.println(i);
//			System.out.println();
			list.add(soft);
		}
	
	}
	
	
	/*虚引用*/
	public static void phantom() {
		ReferenceQueue rq = new ReferenceQueue<>();
		PhantomReference phantom = new PhantomReference(new Object(),rq);
		SoftReference soft = new SoftReference(new Object());
		System.out.println(phantom.get());
		System.out.println(soft.get());
	}
	
	
	/*弱引用*/
	public static void weak() {
		List<WeakReference> list = new ArrayList<WeakReference>();
		ReferenceQueue q = new ReferenceQueue<>();
		for(int i = 0; i< 10; i++) {
			byte[] temp = new byte[1024 * 1024 * 5];
			WeakReference soft = new WeakReference(temp,q);
			System.out.println(soft);
			System.out.println("=======");
			q.poll();
			list.add(soft);
		}
		
		
		System.out.println("=======");
		for(WeakReference w : list) {
			System.out.println(w.get());
		}
	
	}
	
}
