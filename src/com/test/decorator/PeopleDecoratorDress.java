package com.test.decorator;

public class PeopleDecoratorDress extends PeopleDecorator {

	public PeopleDecoratorDress(People people) {
		super(people);
	}

	@Override
	public void date() {
		System.out.println("要去约会，换一套比较帅的衣服");
		super.date();
	}
	
	
	

}
