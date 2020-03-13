package com.huda.duck;

import com.huda.behavior.*;
import com.huda.behavior.Quack;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squek();
	}

	public void display() {
		System.out.println("I'm a decoy duck");
	}
}
