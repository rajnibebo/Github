/**
 * 
 */
package com.rajni.spring.jdbc;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.rajni.spring.jdbc.dao.ContactDao;
import com.rajni.spring.jdbc.dao.plain.PlainContactDao;
import com.rajni.spring.jdbc.domain.Contact;

/**
 * @author rajni.ubhi
 *
 */
public class PlainJdbcSample {

	private static ContactDao contactDao = new PlainContactDao();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Listing initial contact data:");
		listAllContacts();
		System.out.println();
		// Insert a new contact
		System.out.println("Insert a new contact");
		Contact contact = new Contact();
		contact.setFirstName("Jacky");
		contact.setLastName("Chan");
		contact.setBirthDate(new Date((new GregorianCalendar(2001, 10,
		1)).getTime().getTime()));
		contactDao.insert(contact);
		System.out.println("Listing contact data after new contact created:");
		listAllContacts();
		System.out.println();
		System.out.println("Deleting the previous created contact");
		contactDao.delete(contact.getId());
		System.out.println("Listing contact data after new contact deleted:");
		listAllContacts();
	}
	
	private static void listAllContacts() {
		List<Contact> contacts = contactDao.findAll();
		for (Contact contact: contacts) {
			System.out.println(contact);
		}
	}

}
