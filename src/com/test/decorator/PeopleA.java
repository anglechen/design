package com.test.decorator;

public class PeopleA implements People {

	@Override
	public void speak() {
		System.out.println("正在说话");
		
	}

	@Override
	public void date() {
		System.out.println("正在约会");
		
	}

}
