package com.test.decorator;

public class PeopleDecoratorHair extends PeopleDecorator {

	public PeopleDecoratorHair(People people) {
		super(people);
	}

	@Override
	public void date() {
		System.out.println("要去约会了，先去做个头发");
		super.date();
	}
	
	
	

}
