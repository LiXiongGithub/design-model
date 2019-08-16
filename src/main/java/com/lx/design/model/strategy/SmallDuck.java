package com.lx.design.model.strategy;

public class SmallDuck extends Duck{
	public SmallDuck() {
		flyBehavior = new SlowlyFly();
		quiackBehavior = new SmallQuiack();
	}
	@Override
	void display() {
		System.out.println("我是小鸭子");
	}

}
