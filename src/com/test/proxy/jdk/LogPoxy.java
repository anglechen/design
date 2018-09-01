package com.test.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogPoxy implements InvocationHandler {

	private Object obj;
	
	public LogPoxy(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("这里是jdk动态代理的前置处理");
		Object result = method.invoke(obj, args);
		System.out.println("这里是jdk动态代理的后置处理");
		
		return  result;
	}

}
