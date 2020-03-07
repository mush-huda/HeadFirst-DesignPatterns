package com.huda.app;

import com.huda.pizza.Pizza;
import com.huda.pizzastore.*;

public class TestClass {
	
	public static void main(String[] args) {
		
		PizzaStore pizzaStore1 = new NYStylePizzaStore();
		Pizza pizza1 = pizzaStore1.orderPizza("cheese");
		System.out.println("The first order is a " + pizza1.getName() + "\n");
		
		PizzaStore pizzaStore2 = new ChicagoStylePizzaStore();
		Pizza pizza2 = pizzaStore2.orderPizza("veggie");
		System.out.println("The second order is a " + pizza2.getName() + "\n");
	}
}
