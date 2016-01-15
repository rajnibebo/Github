/**
 * 
 */
package com.rajni.hf.beans;

/**
 * @author Rajni
 *
 * @date 29-Dec-2015 11:38:20 pm
 */
public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	/**
	 * 
	 */
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	/** (non-Javadoc)
	 * @see com.rajni.hf.beans.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" , Mocha";
	}

	/** (non-Javadoc)
	 * @see com.rajni.hf.beans.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost()+.20;
	}

}
