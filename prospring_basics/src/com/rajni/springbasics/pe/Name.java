/**
 * 
 */
package com.rajni.springbasics.pe;

/**
 * @author rajni.ubhi
 *
 */
public class Name {
	private String firstName;
	private String lastName;
	
	public Name() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Name()");
	}
	
	public Name(String firstName ,String lastName) {
		System.out.println("Inside Name(String,String");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return firstName+" "+lastName;
	}
}
