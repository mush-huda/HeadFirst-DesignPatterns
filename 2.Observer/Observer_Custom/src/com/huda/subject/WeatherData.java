package com.huda.subject;

import java.util.ArrayList;
import java.util.List;
import com.huda.observer.Observer;


public class WeatherData implements Subject{
	
	private float temperature;
	private float humidity;
	private float pressure;
	private List<Observer> observerList;
	
	public WeatherData() {
		observerList = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) {
		this.observerList.add(observer);
		
	}
	
	public void removeObserver(Observer observer) {
		int i = observerList.indexOf(observer);
		if (i >= 0) {
			this.observerList.remove(observer);
		}
	}
	
	public void notifyObservers() {
		for(Observer o : observerList) {
			o.update();
		}
	}
	
	public void measurementChanged() {
		notifyObservers();
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	
}
