package com.test.strategy;

public class MrketTest {

	public static void main(String[] args) {
		
		Market market = new Market();
		market.setStrategy(new StrategyFive());
		System.out.println("使用五折优惠后的金额：");
		market.getPrice(888.88);
		
		
		market.setStrategy(new StrategyEight());
		System.out.println("使用八折优惠后的金额：");
		market.getPrice(888.88);
		
		
		
	}

}
