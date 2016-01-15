/**
 * 
 */
package com.headfirst.builtinmethod;

import java.util.Observable;
import java.util.Observer;

import com.headfirst.ch2.DisplayElement;

/**
 * @author Rajni
 *
 * @date 11-Jan-2015 12:34:26 am
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Forecast Display--->>>");
		System.out.println("Temperature is : "+temperature);
		System.out.println("Humidity is : "+humidity);
	}

	@Override
	public void update(Observable obs, Object arg1) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
