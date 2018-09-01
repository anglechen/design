package com.test.proxy;

public class RealOjbect implements ObjectInterface {

	@Override
	public void operation() {
		
		System.out.println("这是实际的对象");
		

	}

}
