package com.huda.adapter;

import com.huda.adaptee.Turkey;
import com.huda.target.Duck;

public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {
		turkey.fly();
	}
}
