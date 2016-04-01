/**
 * 
 */
package com.rajni.spring.ch10.service.jpa;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author rajni.ubhi
 *
 */
@Service("ContactSummaryUntype")
@Repository
@Transactional
public class ContactSummaryUntypeImpl {
	@PersistenceContext
	private EntityManager entityManager;
	
	public void displayAllContcatSummary() {
		List result = entityManager.createQuery("select c.firstName,c.lastName,t.telNumber from Contact c " +
				"left join c.contactDetails t where t.telType='Home'").getResultList();
		int count = 0;
		for(Iterator itr = result.iterator(); itr.hasNext();) {
			Object[] obj = (Object[]) itr.next();
			System.out.println((++count)+":"+obj[0]+","+obj[1]+","+obj[2]);
		}
	}
}
