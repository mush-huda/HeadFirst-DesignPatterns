package com.huda.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeinBeverage {

	@Override
	void brew() {
		System.out.println("Steep the teabag in the water");
		
	}

	@Override
	void addCondiments() {
		System.out.println("Add Lemon");
		
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like lemon in your tea? (y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.out.println("IO error while trying to read user input");
			e.printStackTrace();
		}
		
		if(answer == null) {
			return "no";
		}
		return answer;
	}
	
}
