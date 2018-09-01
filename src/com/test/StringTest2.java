package com.test;

import java.util.HashSet;
import java.util.Set;

public class StringTest2 {
	public static void main(String[] args) {
		String  a = "abc";
		String  b = "abc";
		String c = new String("abc");
		String d = new String("abc");
		System.out.println( a == b);
		System.out.println( c == d);
		System.out.println(c.equals(d));
		
		People p1 = new People("张三",20);
		People p2 = new People("张三",20);
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		System.out.println(p1);
		System.out.println(p2);
		
		Set set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		
		
		
		
		
		
		
		
		
		
		
	}
}
