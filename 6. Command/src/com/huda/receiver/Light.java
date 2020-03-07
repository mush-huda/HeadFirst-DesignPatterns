package com.huda.receiver;

public class Light {
	private boolean isOn = false;
	private String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	public void on() {
		if (isOn == false) {
			isOn = true;
			System.out.println(name + " light is on");
		}
	}
	
	public void off() {
		if (isOn == true) {
			isOn = false;
			System.out.println(name + " light is off");
		}
	}
}
