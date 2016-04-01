/**
 * 
 */
package com.rajni.spring.jdbc.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;



/**
 * @author rajni.ubhi
 *
 */
public class Contact implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private List<ContactTelDetail> contactTelDetails;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the date
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param date the date to set
	 */
	public void setBirthDate(Date date) {
		this.birthDate = date;
	}
	
	/**
	 * @return the contactTelDetails
	 */
	public List<ContactTelDetail> getContactTelDetails() {
		return contactTelDetails;
	}
	/**
	 * @param contactTelDetails the contactTelDetails to set
	 */
	public void setContactTelDetails(List<ContactTelDetail> contactTelDetails) {
		this.contactTelDetails = contactTelDetails;
	}
	public String toString() {
		return "Contact id : "+id+"-- FirstName : "+firstName+"-- lastName : "+lastName+"-- BirthDay : "+birthDate ;
	}
	
}
