package com.test.strategy;

public class StrategyEight implements Strategy{

	@Override
	public Double concreateStrategy(Double price) {
		return price *0.8;
	}
	
}
