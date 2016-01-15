/**
 * 
 */
package com.headfirst.ch2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Rajni
 *
 * @date 11-Jan-2015 12:06:28 am
 */
public class WeatherData implements Subject {

	private float temperature;
	private float humidity;
	private float pressure;
	private ArrayList<Observer> observerList = null;

	public WeatherData() {
		// TODO Auto-generated constructor stub
		observerList = new ArrayList<Observer>();
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		if(observerList.indexOf(observer) >= 0) {
			observerList.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Iterator<Observer> iterator = observerList.iterator(); iterator.hasNext();) {
			Observer observer = (Observer) iterator.next();
			observer.update(temperature, pressure, humidity);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature,float pressure,float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanged();
	}
}
