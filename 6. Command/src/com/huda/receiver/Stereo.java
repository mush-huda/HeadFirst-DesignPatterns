package com.huda.receiver;

public class Stereo {
	
	private String name;
	private boolean isOn = false;
	private int volume;
	
	public Stereo(String name) {
		this.name = name;
	}
	public void on() {
		if (isOn == false) {
			isOn = true;
			System.out.println(name + " stereo is on");
		}
	}
	
	public void setCD() {
		System.out.println(name + " stereo is set for CD input");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(name + " stereo volume is set to " + this.volume);
	}
	
	public void off() {
		if (isOn == true) {
			isOn = false;
			System.out.println(name + " stereo is off");
		}
	}
}
