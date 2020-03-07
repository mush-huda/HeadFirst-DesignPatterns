package com.huda.receiver;

public class CeilingFan {
	
	private String name;
	private boolean isOn = false;
	
	public CeilingFan(String name) {
		this.name = name;
	}
	
	public void on() {
		if (isOn == false) {
			isOn = true;
			System.out.println(name + " ceiling fan is on");
		}
	}
	
	public void off() {
		if (isOn == true) {
			isOn = false;
			System.out.println(name + " ceiling fan is off");
		}
	}

}
