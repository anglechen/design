package com.test.strategy;

public class StrategyFive implements Strategy {

	@Override
	public Double concreateStrategy(Double price) {
		return price*0.5;
	}

	
}
