/**
 * 
 */
package com.headfirst.ch2;

/**
 * @author Rajni
 *
 * @date 11-Jan-2015 12:06:51 am
 */
public interface Subject {
	
	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
	
}
