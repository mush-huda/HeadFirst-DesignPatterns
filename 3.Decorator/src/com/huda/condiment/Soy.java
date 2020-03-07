package com.huda.condiment;

import com.huda.beverage.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "soy ";
	}
	
	public double cost() {
		return .30 + beverage.cost();
	}
}
