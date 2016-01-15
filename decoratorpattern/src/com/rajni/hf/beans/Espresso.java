/**
 * 
 */
package com.rajni.hf.beans;

/**
 * @author Rajni
 *
 * @date 29-Dec-2015 11:36:04 pm
 */
public class Espresso extends Beverage{

	/**
	 * 
	 */
	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "Espresso";
	}
	
	/* (non-Javadoc)
	 * @see com.rajni.hf.beans.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1.99;	
	}

}
