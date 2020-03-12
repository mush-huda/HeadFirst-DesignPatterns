package com.huda.client;

import com.huda.adaptee.WildTurkey;
import com.huda.adapter.TurkeyAdapter;
import com.huda.target.Duck;
import com.huda.target.MallardDuck;

public class App {
	
	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		System.out.println("This is a duck:");
		duck.quack();
		duck.fly();
		
		WildTurkey turkey = new WildTurkey();
		System.out.println("\nThis is a turkey:");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThis is a duck who passed the testDuck() exam:: ");
		testDuck(duck);
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("\nThis is a turkey in disguise who passed the testDuck() exam:: ");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
