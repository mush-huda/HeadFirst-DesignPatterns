package com.huda.app;

import com.huda.facade.HomeTheaterFacade;
import com.huda.subsystem.*;

public class App {

	public static void main(String[] args) {
		
		Amplifier amp = new Amplifier();
		CdPlayer cd = new CdPlayer();
		DvdPlayer dvd = new DvdPlayer();
		PopcornPopper popper = new PopcornPopper();
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		Tuner tuner = new Tuner();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, 
				cd, projector, lights, screen, popper);
		
		homeTheater.watchMovie("Pulp Fiction");
		homeTheater.endMovie();
	

	}

}
