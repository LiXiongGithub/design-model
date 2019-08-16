package com.lx.design.model.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	
	QuiackBehavior quiackBehavior;
	
	public void nomalBehavior() {
		System.out.println("所有鸭子都能用的通用普通动作。。。");
	}
	
	public void proformFly() {
		this.flyBehavior.fly();
	}
	
	public void proformQuiack() {
		this.quiackBehavior.quiack();
	}
	
	public void setFlyModel(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuiackBehavior(QuiackBehavior quiackBehavior) {
		this.quiackBehavior = quiackBehavior;
	}
	
	abstract void display();

}
