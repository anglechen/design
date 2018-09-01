package com.test.proxy;

public class TestProxy {
	public static void main(String[] args) {
		
		ObjectInterface ob1 = new ProxyObject(new RealOjbect());
		ob1.operation();
	}
}
