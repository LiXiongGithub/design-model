package com.lx.design.model.strategy;

public class Test {
	//策略模式
	public static void main(String[] args) {
		Duck smallDuck = new SmallDuck();
		smallDuck.display();
		smallDuck.nomalBehavior();
		
		smallDuck.proformFly();
		smallDuck.proformQuiack();
		System.out.println("快速飞行模式开启。。。");
		smallDuck.setFlyModel(new FastFly());
		smallDuck.proformFly();
		System.out.println("大声叫模式开启。。。");
		smallDuck.setQuiackBehavior(new BigQuiack());
		smallDuck.proformQuiack();
		
	}

}
