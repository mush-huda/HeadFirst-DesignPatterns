package com.huda.concreteFactory;
import com.huda.abstractFactory.PizzaIngredientFactory;
import com.huda.productA.*;
import com.huda.productB.*;
import com.huda.productC.*;
import com.huda.productD.*;
import com.huda.productE.*;
import com.huda.productF.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	
	public Dough createDough() {
		return new ThinCrustDough();
	}
	
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClams() {
		return new FreshClams();
	}
}