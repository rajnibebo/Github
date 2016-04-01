/**
 * 
 */
package com.rajni.spring.ch10.service;

import java.util.List;

import com.rajni.spring.ch10.domain.Contact;

/**
 * @author rajni.ubhi
 *
 */
public interface ContactService {
	public List<Contact> findall();
	
	public List<Contact> findAllWithDetail();
	
	public Contact findById(Long contactId);
	
	public Contact save(Contact contact);
	
	public void delete(Contact contact);
	
	public List<Contact> findAllByNativeQuery();
	
	public List<Contact> findAllByCriteria(String firstName,String lastName);
}
