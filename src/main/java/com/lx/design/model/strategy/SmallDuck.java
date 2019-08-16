package com.lx.design.model.strategy;

public class SmallDuck extends Duck{
	public SmallDuck(FlyBehavior flyBehavior,QuiackBehavior quiackBehavior) {
		super.flyBehavior = flyBehavior;
		super.quiackBehavior = quiackBehavior;
	}
	@Override
	void display() {
		System.out.println("我是小鸭子");
	}

}
