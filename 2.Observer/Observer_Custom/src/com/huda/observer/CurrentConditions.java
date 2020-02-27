package com.huda.observer;

import com.huda.display.DisplayElement;
import com.huda.subject.WeatherData;

public class CurrentConditions implements Observer, DisplayElement {
	private double temperature;
	private double humidity;
	private double pressure;
	private WeatherData weatherData;

	public CurrentConditions(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		this.pressure = weatherData.getPressure();
		display();
	}

	public void display() {
		System.out.print("Current conditions: " + "Temperature: " + temperature 
				+ "C" + " Humidity: " + humidity + "%" + " Pressure: " + pressure + "\n");
	}
}