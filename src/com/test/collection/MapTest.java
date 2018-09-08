package com.test.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest implements TestA  {
	
	
	class Test implements TestA {
		private String name;
		public void test() {
			System.out.println("内部类方法");
		}
		@Override
		public void testa() {
			System.out.println("内部类实现tsta接口的方法");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		MapTest mapTest = new MapTest();
		mapTest.testa();
		Test te = mapTest.new Test(); 
		te.testa();
		
		
//		Map map = new HashMap<>();
//		map.put("name", "张三");
//		map.put("age", "23");
//		map.put("sex", "男");
//		Set<Map.Entry> entrys = map.entrySet();
//		for(Map.Entry entry : entrys) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
	}


	@Override
	public void testa() {
		System.out.println("外部类testa接口的实现");
		
	}
}


	
	
	
	
	
	
	
	
