/**
 * 
 */
package com.rajni.spring.ch10;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.spring.ch10.domain.Contact;
import com.rajni.spring.ch10.domain.ContactTelDetails;
import com.rajni.spring.ch10.domain.Hobby;
import com.rajni.spring.ch10.service.ContactService;

/**
 * @author rajni.ubhi
 *
 */
public class JpaSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/spring/ch10/app-context.xml");
		ctx.refresh();
		
		ContactService service = ctx.getBean("jpaContactService", ContactService.class);
		// inserting record
		Contact contact = new Contact();
		contact.setFirstName("Rajni");
		contact.setLastName("Ubhi");
		contact.setBirthDate(new Date());
		
		ContactTelDetails contactTelDetails = new ContactTelDetails();
		contactTelDetails.setTelType("Home");
		contactTelDetails.setTelNumber("1234567ppp89");
		
		contactTelDetails.setContact(contact);
		contact.getContactDetails().add(contactTelDetails);
		
		//listAllDetails(service.findall());
		service.save(contact);
		listAllDetails(service.findAllWithDetail());
		// updating record !!
		contact = service.findById(4l);
		contact.setFirstName("Rajni!!!");
		contact = service.save(contact);
		// find any record !!!
		System.out.println(service.findById(4l));
		System.out.println();
		System.out.println("------------------------------------------------");
		//listAllDetails(service.findAllWithDetail());
		
		contact = service.findById(1l);
		
		// delete contact
		service.delete(contact);
		
//	/	listAllDetails(service.findAllByNativeQuery());
		System.out.println(service.findAllByCriteria("Scott", "Tiger"));
		
	}

	private static void listAllDetails(List<Contact> contacts) {
		for(Contact contact : contacts) {
			System.out.println(contact);
			if(contact.getContactDetails() != null) {
				for(ContactTelDetails telDetails : contact.getContactDetails()) {
					System.out.println(" -------"+telDetails);
				}
				System.out.println();
			}
			if(contact.getHobbies() != null) {
				for(Hobby hobby : contact.getHobbies()) {
					System.out.println(hobby);
				}
			}
			System.out.println();
		}
	}
}
