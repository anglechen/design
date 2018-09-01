package com.test.decorator;

public class PeopleDecorator  implements People{

	private People people;
	
	public PeopleDecorator(People people) {
		this.people = people;
	}
	
	
	
	@Override
	public void speak() {
		people.speak();
		
	}

	@Override
	public void date() {
		people.date();
		
	}

}
