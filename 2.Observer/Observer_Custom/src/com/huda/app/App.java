package com.huda.app;

import com.huda.observer.CurrentConditions;
import com.huda.observer.Observer;
import com.huda.subject.WeatherData;

public class App {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer currentCondition = new CurrentConditions(weatherData);
		
		weatherData.setTemperature(40);
		weatherData.setHumidity(80);
		weatherData.setPressure(120);
		weatherData.measurementChanged();
		
		weatherData.setTemperature(30);
		weatherData.setHumidity(50);
		weatherData.setPressure(100);
		weatherData.measurementChanged();

	}

}
