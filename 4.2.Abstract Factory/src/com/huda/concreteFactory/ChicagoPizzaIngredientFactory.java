package com.huda.concreteFactory;
import com.huda.abstractFactory.PizzaIngredientFactory;
import com.huda.productA.*;
import com.huda.productB.*;
import com.huda.productC.*;
import com.huda.productD.*;
import com.huda.productE.*;
import com.huda.productF.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
	
	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Spinach(), new BlackOlives()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClams() {
		return new FrozenClams();
	}
}
