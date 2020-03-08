package com.huda.app;

import com.huda.client.NYPizzaStore;
import com.huda.client.PizzaStore;
import com.huda.pizza.Pizza;

public class App {
	
	public static void main(String[] args) {
		
		PizzaStore nyPizzaStore1 = new NYPizzaStore();
		Pizza pizza1 = nyPizzaStore1.orderPizza("cheese");
		
		System.out.println("The first order is a " + pizza1.getName() + "\n");
	}
}
