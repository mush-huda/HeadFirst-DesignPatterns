package com.huda.abstractFactory;
import com.huda.productA.*;
import com.huda.productB.*;
import com.huda.productC.*;
import com.huda.productD.*;
import com.huda.productE.*;
import com.huda.productF.*;


public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
