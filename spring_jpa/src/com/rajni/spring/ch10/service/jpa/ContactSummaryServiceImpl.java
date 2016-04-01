/**
 * 
 */
package com.rajni.spring.ch10.service.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rajni.spring.ch10.domain.ContactSummary;
import com.rajni.spring.ch10.service.ContactSummaryService;

/**
 * @author rajni.ubhi
 *
 */
@Service("contactSummaryService")
@Transactional
@Repository
public class ContactSummaryServiceImpl implements ContactSummaryService{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(readOnly = true)
	public List<ContactSummary> findAll() {
		// TODO Auto-generated method stub
		String sql = "select new com.rajni.spring.ch10.domain.ContactSummary(c.firstName,c.lastName,t.telNumber) " +
				"from Contact c left join c.contactDetails t where t.telType='Home'";
		return entityManager.createQuery(sql, ContactSummary.class).getResultList();
	}

}
