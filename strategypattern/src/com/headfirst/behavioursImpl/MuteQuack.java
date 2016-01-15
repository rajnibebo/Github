/**
 * 
 */
package com.headfirst.behavioursImpl;

import com.headfirst.behaviours.QuackBehaviour;

/**
 * @author Rajni
 *
 * @date 10-Jan-2015 1:41:24 pm
 */
public class MuteQuack implements QuackBehaviour {

	/** (non-Javadoc)
	 * @see com.headfirst.behaviours.QuackBehaviour#quack()
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<<< Silence >>>");
	}

}
