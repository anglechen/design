package com.test.template;

public abstract class EggTemplate {
	
	public void eggRice() {
//		1.放油
		pourOil();
		
//		2.把油烧热
		heatOil();
		
		
//		3.放鸡蛋
		pourEggs();
		
		
//		4.放米饭
		pourRice();
		
//		5.翻炒一下鸡蛋和米饭
		friced();
		
//		6.放点调料
		pourCondiment();
		
		
//		7.出锅
		out(); 
		

		
		
	}

	private void out() {
		System.out.println("出锅....");
		
	}

	public abstract void pourCondiment() ;

	private void friced() {
		System.out.println("翻炒....");
		
	}

	private void pourRice() {
		System.out.println("倒入米饭....");
		
	}

	public abstract void pourEggs() ;

	private void heatOil() {
		System.out.println("把油烧热....");
		
	}

	private void pourOil() {
		System.out.println("放油......");
	}

}
