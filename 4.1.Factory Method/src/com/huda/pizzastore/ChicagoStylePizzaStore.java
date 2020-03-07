package com.huda.pizzastore;

import com.huda.pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore{

	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if(type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}
}