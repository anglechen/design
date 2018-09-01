package com.test.strategy;

public class Market {
	
	private Strategy strategy;
	
	
	
	
	public Strategy getStrategy() {
		return strategy;
	}




	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}




	public void getPrice(Double price) {
		
		Double resultPrice = strategy.concreateStrategy(price);
		System.out.println(resultPrice);
	}
}
