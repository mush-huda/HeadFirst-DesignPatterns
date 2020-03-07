package com.huda.receiver;

public class GarageDoor {
	
	private String name;
	private boolean isOn = false;
	
	public GarageDoor(String name) {
		this.name = name;
	}
	
	public void up() {
		if (isOn == false) {
			isOn = true;
			System.out.println(name + " Garage door is up");
		}
	}
	
	public void down() {
		if (isOn == true) {
			isOn = false;
			System.out.println(name + " Garage door is down");
		}
	}

}
