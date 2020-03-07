package com.huda.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough; 
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	

	public void prepare() {
		System.out.println("Prepare everything");
	}
	public void bake() {
		System.out.println("Bake for 25mins at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza");
	}
	
	public void box() {
		System.out.println("Put inside a box");
	}
	
	public String getName() {
		return name;
	}
}