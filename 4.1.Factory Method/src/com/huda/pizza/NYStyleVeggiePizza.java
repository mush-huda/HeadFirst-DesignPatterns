package com.huda.pizza;

public class NYStyleVeggiePizza extends Pizza{
	
	public NYStyleVeggiePizza() {
		name = "NY style veggie pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";
		toppings.add("None");
	}
	
	public void cut() {
		System.out.println("Cut this pizza into large pieces");
	}
}