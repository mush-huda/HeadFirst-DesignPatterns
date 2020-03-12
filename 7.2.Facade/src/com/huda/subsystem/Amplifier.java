package com.huda.subsystem;

public class Amplifier {
	
	private DvdPlayer dvd;

	public void on(){
		System.out.println("Amplifier is on");
	}
	
	public void off(){
		System.out.println("Amplifier is off");
	}
	
	public void setDvd(DvdPlayer dvd) {
		this.dvd = dvd;
		System.out.println("Amplifier is setting DVD player to: " + dvd.getName());
	}
	
	public void setSurroundSound() {
		System.out.println("Amplifier surroung sound is on");
	}
	
	public void setVolume(int vol) {
		System.out.println("Amplifier is setting volume to " + vol);
	}

	public DvdPlayer getDvd() {
		return dvd;
	}
	
	
}
