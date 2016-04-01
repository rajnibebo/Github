/**
 * 
 */
package com.rajni.spring.ch10.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name="hobby")
public class Hobby {
	private String hobbyId;
	private Set<Contact> contacts = new HashSet<Contact>();

	/**
	 * @return the hobbyId
	 */
	@Id
	@Column(name="hobby_id")
	public String getHobbyId() {
		return hobbyId;
	}

	/**
	 * @param hobbyId the hobbyId to set
	 */
	public void setHobbyId(String hobbyId) {
		this.hobbyId = hobbyId;
	}
	
	/**
	 * @return the contacts
	 */
	@ManyToMany
	@JoinTable(name="contact_hobby_detail",joinColumns=@JoinColumn(name="hobby_id"),inverseJoinColumns=@JoinColumn(name="contact_id"))
	public Set<Contact> getContacts() {
		return contacts;
	}

	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

	public String toString() {
		return "Hobby [id : "+hobbyId+"]";
	}
	
}
