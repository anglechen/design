package com.test.proxy;

public class ProxyObject implements ObjectInterface {

	private ObjectInterface obj;
	
	
	public ProxyObject(ObjectInterface obj) {
		this.obj = obj;
	}
	
	@Override
	public void operation() {
		System.out.println("方法开始调用");
		obj.operation();
		System.out.println("方法调用结束");
	}

}
