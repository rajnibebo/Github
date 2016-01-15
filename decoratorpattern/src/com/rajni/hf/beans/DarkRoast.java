/**
 * 
 */
package com.rajni.hf.beans;

/**
 * @author Rajni
 *
 * @date 29-Dec-2015 11:49:40 pm
 */
public class DarkRoast extends Beverage{

	/**
	 * 
	 */
	public DarkRoast() {
		// TODO Auto-generated constructor stub
		description = "Dark Roast";
	}
	
	/* (non-Javadoc)
	 * @see com.rajni.hf.beans.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 20.58;
	}

}
