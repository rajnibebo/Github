/**
 * 
 */
package com.rajni.spring.jdbc.dao;

import java.util.List;

import com.rajni.spring.jdbc.domain.Contact;

/**
 * @author rajni.ubhi
 * 
 */
public interface ContactDao {
	public List<Contact> findAll();

	public List<Contact> findByFirstName(String firstName);

	public void insert(Contact contact);

	public void update(Contact contact);

	public void delete(Long contactId);
}
