/**
 * 
 */
package com.rajni.spring.ch10.service;

import java.util.List;

import com.rajni.spring.ch10.domain.ContactSummary;

/**
 * @author rajni.ubhi
 *
 */
public interface ContactSummaryService {
	public List<ContactSummary> findAll();
}
