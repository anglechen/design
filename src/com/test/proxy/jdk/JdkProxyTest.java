package com.test.proxy.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

import com.test.proxy.ObjectInterface;
import com.test.proxy.RealOjbect;

public class JdkProxyTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		System.out.println(JdkProxyTest.class.getClassLoader().getParent());
		
//		一：通过获取代理class 然后通过反射获取代理对象
//		Class clazz = Proxy.getProxyClass(ObjectInterface.class.getClassLoader(),
//				ObjectInterface.class);
//		Constructor constructor = clazz.getConstructor(InvocationHandler.class);
		
//		ObjectInterface realObj =  (ObjectInterface) constructor.newInstance(new LogPoxy(new RealOjbect()));
		
		
		
		ObjectInterface realObj = (ObjectInterface) Proxy.newProxyInstance(ObjectInterface.class.getClassLoader(),
				new Class[] {ObjectInterface.class}, new LogPoxy(new RealOjbect()));
		realObj.operation();
		
		
		
		
		
		
		
		
		
		
	}
}
