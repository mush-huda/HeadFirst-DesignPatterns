package com.huda.app;

import com.huda.duck.*;

public class App {
	
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		DecoyDuck decoyDuck = new DecoyDuck();
		decoyDuck.display();
		decoyDuck.performFly();
		decoyDuck.performQuack();
	}
}
