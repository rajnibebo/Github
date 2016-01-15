/**
 * 
 */
package com.headfirst.behavioursImpl;

import com.headfirst.behaviours.FlyBehaviour;

/**
 * @author Rajni
 *
 * @date 10-Jan-2015 1:35:29 pm
 */
public class FlyNoWay implements FlyBehaviour {

	/** (non-Javadoc)
	 * @see com.headfirst.behaviours.FlyBehaviour#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can't fly...");
	}

}
