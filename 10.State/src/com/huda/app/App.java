package com.huda.app;

import com.huda.state.GumballMachine;

public class App {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine);
		gumballMachine.ejectQuarter();
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}

}
