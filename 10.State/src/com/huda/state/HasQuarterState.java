package com.huda.state;

public class HasQuarterState implements State{
	
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("There's already a quarter");
	}
	
	public void ejectQuarter() {
		System.out.println("You have ejected the quarter");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	public void turnCrank() {
		System.out.println("You turned the crank");
		gumballMachine.setState(gumballMachine.getSoldState());
	}
	
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
}
