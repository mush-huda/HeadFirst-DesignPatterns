package com.huda.state;

public class SoldOutState implements State{
	
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("Sorry, you can't insert a quarter because we're out of gumballs");
	}
	
	public void ejectQuarter() {
		System.out.println("There's no quarter to eject");
	}
	
	public void turnCrank() {
		System.out.println("You turned but we're out of gumballs");
	}
	
	public void dispense() {
		System.out.println("No gumballs dispensed");
	}
}