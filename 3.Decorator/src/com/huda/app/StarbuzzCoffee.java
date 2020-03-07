package com.huda.app;

import com.huda.beverage.Beverage;
import com.huda.beverage.Cappuccino;
import com.huda.beverage.Espresso;
import com.huda.condiment.Milk;
import com.huda.condiment.Soy;
import com.huda.condiment.WhippedCream;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + beverage.cost() + "€");
		
		Beverage beverage2 = new Cappuccino();
		beverage2 = new Milk(beverage2);
		beverage2 = new Soy(beverage2);
		beverage2 = new WhippedCream(beverage2);
		
		System.out.println(beverage2.getDescription() + beverage2.cost() + "€");
		
	}

}
