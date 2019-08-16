package com.lx.design.model.strategy;

public class SlowlyFly implements FlyBehavior{

	public void fly() {
		System.out.println("缓慢飞行");
	}
}
