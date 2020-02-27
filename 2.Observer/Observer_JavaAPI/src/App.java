import java.util.Observable;

public class App {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentCon = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forcast = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurement(35.3f, 45f, 18f);
		weatherData.setMeasurement(25f, 55f, 28f);
	}
}
