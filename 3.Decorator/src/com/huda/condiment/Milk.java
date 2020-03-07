package com.huda.condiment;

import com.huda.beverage.Beverage;

public class Milk extends CondimentDecorator{
	
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + "milk ";
	}

	public double cost() {
		return .20 + beverage.cost();
	}

}
