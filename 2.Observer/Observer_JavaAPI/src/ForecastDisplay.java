import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
	Observable observable;
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}
	
	public void display() {
		System.out.println("The current pressure is: " + currentPressure + 
				" and the last pressure was: " + lastPressure + "\n");
	}
}
