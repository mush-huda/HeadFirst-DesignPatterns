package com.huda.template;

public abstract class CaffeinBeverage {
	
	// template method
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}

	}
	
	// concrete methods
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	// abstract methods
	abstract void brew();
	abstract void addCondiments();
	
	// hook method
	boolean customerWantsCondiments(){
		return true;
	}

}
