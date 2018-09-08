package com.test.refrence;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class RefrenceTest {

	public static void main(String[] args) {
//		strong();
		soft();
//		weak();
//		phantom();
	}
	
	
	public static void strong() {
		//强引用
		List list = new ArrayList<>();
		for(int i = 0 ; i< 10; i++) {
			byte[] bs = new byte[1024 * 1024 * 5];
			list.add(bs);
			System.out.println(i);
		}
				
	}
	
	public static void soft() {
		//强引用
		List<SoftReference> list = new ArrayList<>();
		ReferenceQueue ref = new ReferenceQueue<>();
		for(int i = 0 ; i< 4; i++) {
			SoftReference soft = new SoftReference(new byte[1024 * 1024 * 5],ref);
			list.add(soft);
			System.out.println(i);
			System.out.println(soft);
		}
		System.out.println("====");
		System.out.println(ref.poll());
		System.out.println(ref.poll());
		System.out.println(ref.poll());
		System.out.println(ref.poll());
		System.out.println("=======");
		for(SoftReference s : list) {
			System.out.println(s.get());
		}
				
	}
	
	
	public static void weak() {
		//强引用
		List<WeakReference> list = new ArrayList<>();
		
		for(int i = 0 ; i< 3; i++) {
			WeakReference soft = new WeakReference(new byte[1024 * 1024 * 5]);
			list.add(soft);
			System.out.println(i);
		}
		for(WeakReference s : list) {
			System.out.println(s.get());
		}
				
	}
	public static void phantom() {
		//强引用
		List<PhantomReference> list = new ArrayList<>();
		ReferenceQueue ref = new ReferenceQueue<>();
		for(int i = 0 ; i< 2; i++) {
			PhantomReference soft = new PhantomReference("22",ref);
			list.add(soft);
			System.out.println(i);
		}
		for(PhantomReference s : list) {
			System.out.println(s.get());
		}
				
	}

}
