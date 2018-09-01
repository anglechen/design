package com.test.decorator;

public class PeopleTest {
	public static void main(String[] args) {
		 People p1= new PeopleA();
		 p1 = new PeopleDecoratorHair(p1);
		 p1 = new PeopleDecoratorDress(p1);
		 p1.date();
	}
}
