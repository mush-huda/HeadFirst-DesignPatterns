package com.huda.duck;

import com.huda.behavior.*;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	public void display() {
		System.out.println("I'm a rubber duck");
	}
}