/**
 * 
 */
package com.rajni.hf.beans;

/**
 * @author Rajni
 *
 * @date 29-Dec-2015 11:40:20 pm
 */
public class StarbuzzCoffe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		beverage.setSize(Beverage.TALL);
		System.out.println(beverage.description+" $ "+beverage.getCost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(Beverage.GRANDE);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription()+" $ "+beverage2.getCost());
		
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription()+" $ "+beverage2.getCost());
		
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDescription()+" $ "+beverage2.getCost());
	}

}
