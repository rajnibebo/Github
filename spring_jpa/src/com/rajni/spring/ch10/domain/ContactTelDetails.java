/**
 * 
 */
package com.rajni.spring.ch10.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name="contact_tel_detail")
public class ContactTelDetails {

	private Long id;
	private int version;
	private String telType;
	private String telNumber;
	private Contact contact;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
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
	 * @return the version
	 */
	@Version
	@Column(name="version")
	public int getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * @return the telType
	 */
	@Column(name="tel_type")
	public String getTelType() {
		return telType;
	}
	/**
	 * @param telType the telType to set
	 */
	public void setTelType(String telType) {
		this.telType = telType;
	}
	/**
	 * @return the telNumber
	 */
	@Column(name="tel_number")
	public String getTelNumber() {
		return telNumber;
	}
	/**
	 * @param telNumber the telNumber to set
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	/**
	 * @return the contact
	 */
	@ManyToOne
	@JoinColumn(name="contact_id")
	public Contact getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
	
	public String toString() {
		return "ContactTelDetails [Tel_type : "+telType+" , Tel_number : "+telNumber+", Contact : "+id+"]";
	}
	
	
}
