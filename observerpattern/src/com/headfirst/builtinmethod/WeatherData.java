/**
 * 
 */
package com.headfirst.builtinmethod;

import java.util.Observable;

/**
 * @author Rajni
 *
 * @date 11-Jan-2015 12:30:34 am
 */
public class WeatherData extends Observable {
	private float temperature;
	private float pressure;
	private float humidity;

	public WeatherData() {
		// TODO Auto-generated constructor stub
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature,float pressure,float humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanged();
	}
	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}
	
}
