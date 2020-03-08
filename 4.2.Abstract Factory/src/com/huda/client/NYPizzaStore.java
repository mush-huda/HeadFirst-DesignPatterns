package com.huda.client;
import com.huda.abstractFactory.PizzaIngredientFactory;
import com.huda.concreteFactory.NYPizzaIngredientFactory;
import com.huda.pizza.CheesePizza;
import com.huda.pizza.ClamPizza;
import com.huda.pizza.PepperoniPizza;
import com.huda.pizza.Pizza;
import com.huda.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York style cheese pizza");
		} else if(item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York style veggie pizza");
		} else if(item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York style clam pizza");
		} else if(item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York style pepperoni pizza");
		}
		return pizza;
		
	}
}
