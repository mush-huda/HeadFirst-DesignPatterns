package com.huda.pizzastore;

import com.huda.pizza.NYStyleCheesePizza;
import com.huda.pizza.NYStyleVeggiePizza;
import com.huda.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore{

	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if(type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}
}
