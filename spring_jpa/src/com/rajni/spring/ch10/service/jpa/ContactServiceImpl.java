/**
 * 
 */
package com.rajni.spring.ch10.service.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rajni.spring.ch10.domain.Contact;
import com.rajni.spring.ch10.domain.Contact_;
import com.rajni.spring.ch10.service.ContactService;

/**
 * @author rajni.ubhi
 *
 */
@Service("jpaContactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService{

	@PersistenceContext
	private EntityManager entityManager;
	
	final static String FIND_ALL_NATIVE_QUERY = "select id,first_name,last_name,birth_date,version from contact";
	
	@Override
	@Transactional
	public List<Contact> findall() {
		// TODO Auto-generated method stub
		List<Contact> contactlist = entityManager.createNamedQuery("Contact.findAll").getResultList();
		return contactlist;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Contact> findAllWithDetail() {
		// TODO Auto-generated method stub
		List<Contact> contactlist = entityManager.createNamedQuery("Contact.findAllWithDetail").getResultList();
		return contactlist;
	}

	@Override
	@Transactional(readOnly = true)
	public Contact findById(Long contactId) {
		// TODO Auto-generated method stub
		TypedQuery<Contact> query = entityManager.createNamedQuery("Contact.findById", Contact.class);
		query.setParameter("id",contactId);
		return query.getSingleResult();
	}

	@Override
	@Transactional
	public Contact save(Contact contact) {
		// TODO Auto-generated method stub
		if(contact.getId() == null) {
			System.out.println("Inserting record !!");
			entityManager.persist(contact);
			
		} else {
			System.out.println("Record updated !!");
			entityManager.merge(contact);
			
		}
		System.out.println("Record inserted/merged is :"+contact);
		return contact;
	}

	@Override
	@Transactional
	public void delete(Contact contact) {
		// TODO Auto-generated method stub
		Contact mergedContact = entityManager.merge(contact);
		entityManager.remove(mergedContact);
		System.out.println("contact deleted successfully");
		System.out.println(contact);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Contact> findAllByNativeQuery() {
		// TODO Auto-generated method stub
		//return entityManager.createNativeQuery(FIND_ALL_NATIVE_QUERY, Contact.class).getResultList();
		return entityManager.createNativeQuery(FIND_ALL_NATIVE_QUERY, "contactResult").getResultList();
	}

	@Override
	public List<Contact> findAllByCriteria(String firstName, String lastName) {
		// TODO Auto-generated method stub
		System.out.println("First name : "+firstName+" , last name : "+lastName);
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Contact> criteriaQuery = cb.createQuery(Contact.class);
		Root<Contact> root = criteriaQuery.from(Contact.class);
		root.fetch(Contact_.contactDetails, JoinType.LEFT);
		root.fetch(Contact_.hobbies,JoinType.LEFT);
		
		criteriaQuery.select(root).distinct(true);
		
		Predicate criteria = cb.conjunction();
		if(firstName != null) {
			Predicate p = cb.equal(root.get(Contact_.firstName), firstName);
			criteria = cb.and(criteria,p);
		}
		if(lastName != null) {
			Predicate p = cb.equal(root.get(Contact_.lastName), lastName);
			criteria = cb.and(criteria,p);
		}
		
		criteriaQuery.where(criteria);
		return entityManager.createQuery(criteriaQuery).getResultList();
	}

}
