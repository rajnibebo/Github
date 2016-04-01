/**
 * 
 */
package com.rajni.hib.apress.mapping;

import java.io.Serializable;

/**
 * @author rajni.ubhi
 *
 */
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomerId customerId;
	/*private String countryCode;
	private String idCardNo;*/
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	
	
	/**
	 * @return the customerId
	 */
	public CustomerId getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(CustomerId customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the countryCode
	 */
	/*public String getCountryCode() {
		return countryCode;
	}*/
	/**
	 * @param countryCode the countryCode to set
	 */
//	public void setCountryCode(String countryCode) {
//		this.countryCode = countryCode;
//	}
	/**
	 * @return the idCardNo
	 */
//	public String getIdCardNo() {
//		return idCardNo;
//	}
	/**
	 * @param idCardNo the idCardNo to set
	 */
//	public void setIdCardNo(String idCardNo) {
//		this.idCardNo = idCardNo;
//	}
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String toString() {
		return customerId.toString();
	}
	
}
