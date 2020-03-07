package com.huda.condiment;

import com.huda.beverage.Beverage;

public class WhippedCream extends CondimentDecorator {
	Beverage beverage;
	
	public WhippedCream(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "whipped cream ";
	}
	
	public double cost() {
		return .50 + beverage.cost();
	}

}
