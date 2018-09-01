package com.test.obsever;

public class ObserTest {
	public static void main(String[] args) {
		ConcreateObsever ob1 = new ConcreateObsever();
		ob1.setName("张三");
		ConcreateObsever ob2 = new ConcreateObsever();
		ob2.setName("李四");
		
		ConcreateSubject subject = new ConcreateSubject();
		subject.addObsever(ob1);
		subject.addObsever(ob2);

		subject.setStatus("a回来了");
		
		
	}
}
