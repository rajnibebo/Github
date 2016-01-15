/**
 * 
 */
package com.rajni.hf.beans;

/**
 * @author Rajni
 *
 * @date 29-Dec-2015 11:37:15 pm
 */
public class HouseBlend extends Beverage{

	/**
	 * 
	 */
	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description = "House Blend Coffee";
	}
	
	/* (non-Javadoc)
	 * @see com.rajni.hf.beans.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.83;
	}

}
