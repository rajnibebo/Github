/**
 * 
 */
package com.rajni.spring.ch10.domain;

/**
 * @author rajni.ubhi
 *
 */
public class ContactSummary {
	private String firstName;
	private String lastName;
	private String homeTelNumber;
	
	public ContactSummary(String firstName,String lastName,String homeTelNumber) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeTelNumber = homeTelNumber;
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
	/**
	 * @return the homeTelNumber
	 */
	public String getHomeTelNumber() {
		return homeTelNumber;
	}
	/**
	 * @param homeTelNumber the homeTelNumber to set
	 */
	public void setHomeTelNumber(String homeTelNumber) {
		this.homeTelNumber = homeTelNumber;
	}
	
	public String toString() {
		return "ContactSummary : [ firstName : "+firstName+",lastName : "+lastName+",homeTelNumber : "+homeTelNumber+"]";
	}
	
}
