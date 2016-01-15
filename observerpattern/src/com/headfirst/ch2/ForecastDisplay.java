/**
 * 
 */
package com.headfirst.ch2;

/**
 * @author Rajni
 *
 * @date 11-Jan-2015 12:19:12 am
 */
public class ForecastDisplay implements Observer,DisplayElement{

	Subject weatherData;
	private float temperature;
	private float pressure;
	
	public ForecastDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(2.5f, 1.0f, 1.36f);
		forecastDisplay.display();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Forecast Display--->>>");
		System.out.println("Temperature is : "+temperature);
		System.out.println("Pressure is : "+pressure);
	}

	@Override
	public void update(float temp, float pressure, float humidity) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.pressure = pressure;
		display();
	}

}
