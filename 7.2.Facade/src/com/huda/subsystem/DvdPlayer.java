package com.huda.subsystem;

public class DvdPlayer {
	
	private String name = "Top-o-line DVD Player";
	private String movieName;
	
	public void on(){
		System.out.println("DVD Player is on");
	}
	
	public void off(){
		System.out.println("DVD Player is off");
	}
	
	public void play(String name){
		setMovieName(name);
		System.out.println("DVD Player is playing the movie: " + getMovieName());
	}
	
	public void stop(){
		System.out.println("DVD Player stopped the movie: " + getMovieName());
	}
	
	public void eject(){
		System.out.println("DVD has been ejected");
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getName() {
		return name;
	}
}
