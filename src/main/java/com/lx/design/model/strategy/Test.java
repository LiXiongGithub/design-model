package com.lx.design.model.strategy;

public class Test {
	// 策略模式
	public static void main(String[] args) {
		//初始化飞行和叫声模式
		Duck smallDuck = new SmallDuck(new SlowlyFly(),new SmallQuiack());
		smallDuck.display();
		smallDuck.nomalBehavior();
		smallDuck.proformFly();
		smallDuck.proformQuiack();
		/**
		 * 运行时动态改变飞行方式，并且新增飞行方式或者叫声方式时，不需要改变smallDuck类，只需新增接口的实现类，在运行时可动态改变
		 * smallDuck.proformFly();同样的方法，不同的动作
		 */
		System.out.println("快速飞行模式开启。。。");
		smallDuck.setFlyModel(new FastFly());
		smallDuck.proformFly();
		/**
		 * 运行时可动态改变叫声方式，可将入参对象new BigQuiack()以前端控制或者数据库的方式，或者配置的方式，就可实现动态改变，而不需要发布新版本
		 * smallDuck.proformQuiack();同样的方法，不同的动作
		 */
		System.out.println("大声叫模式开启。。。");
		smallDuck.setQuiackBehavior(new BigQuiack());
		smallDuck.proformQuiack();

	}

}
