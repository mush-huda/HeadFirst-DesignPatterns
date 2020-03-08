package com.huda.pizza;
import com.huda.productA.*;
import com.huda.productB.*;
import com.huda.productC.*;
import com.huda.productD.*;
import com.huda.productE.*;
import com.huda.productF.*;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 mins at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public String toString() {
//		StringBuffer stringBuff = new StringBuffer();
//		stringBuff.append(obj.getClass().getName());
//		return stringBuff.toString();
//	}
}
