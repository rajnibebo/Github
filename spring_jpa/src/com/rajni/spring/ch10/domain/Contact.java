/**
 * 
 */
package com.rajni.spring.ch10.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name="contact")
@NamedQueries({@NamedQuery(name="Contact.findAll",query="select c from Contact c"),
	@NamedQuery(name="Contact.findById",
	query="select distinct c from Contact c left join fetch c.contactDetails t left join fetch c.hobbies h where c.id = :id"),
	@NamedQuery(name="Contact.findAllWithDetail",
	query="select distinct c from Contact c left join fetch c.contactDetails t left join fetch c.hobbies h")})
@SqlResultSetMapping(name="contactResult",entities=@EntityResult(entityClass=Contact.class))
public class Contact {
	private Long id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private int version;
	private Set<ContactTelDetails> contactDetails = new HashSet<ContactTelDetails>();
	
	private Set<Hobby> hobbies = new HashSet<Hobby>();
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	 * @return the firstName
	 */
	@Column(name="first_name")
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
	@Column(name="last_name")
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
	 * @return the birthDate
	 */
	@Column(name="birth_date")
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
	 * @return the contactDetails
	 */
	@OneToMany(mappedBy="contact",cascade=CascadeType.ALL,orphanRemoval=true)
	public Set<ContactTelDetails> getContactDetails() {
		return contactDetails;
	}
	/**
	 * @param contactDetails the contactDetails to set
	 */
	public void setContactDetails(Set<ContactTelDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	/**
	 * @return the hobbies
	 */
	@ManyToMany
	@JoinTable(name="contact_hobby_detail",joinColumns=@JoinColumn(name="contact_id"),inverseJoinColumns=@JoinColumn(name="hobby_id"))
	public Set<Hobby> getHobbies() {
		return hobbies;
	}
	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(Set<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
	public String toString() {
		return "Contact [id : +"+id+" , first_name :"+firstName+" ,last_name : "+lastName+",birth_date : +"+birthDate+"]";
	}
	
	
	
}
