/**
 * 
 */
package com.rajni.hf.beans;

/**
 * @author Rajni
 *
 * @date 29-Dec-2015 11:33:13 pm
 */
public abstract class Beverage {
	
	public static final int TALL = 0;
	public static final int GRANDE = 1;
	public static final int VENTI = 2;
	
	protected String description = "Unknown Beverage";
	private int size;
	
	public String getDescription() {
		return description;
	}
	
	public void setSize(int size) {
		if(size == TALL) {
			this.size = TALL;
		} else if (size == GRANDE) {
			this.size = GRANDE;
		} else {
			this.size = VENTI;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public abstract double getCost();
}
