/**
 * 
 */
package com.headfirst.classes;

import com.headfirst.behavioursImpl.FlyWithWings;
import com.headfirst.behavioursImpl.Quack;

/**
 * @author Rajni
 *
 * @date 10-Jan-2015 1:45:41 pm
 */
public class MallardDuck extends Duck {

	/**
	 * 
	 */
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	/** (non-Javadoc)
	 * @see com.headfirst.classes.Duck#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a MallardDuck...");
	}

}
