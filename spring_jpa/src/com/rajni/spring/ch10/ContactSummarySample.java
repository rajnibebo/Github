/**
 * 
 */
package com.rajni.spring.ch10;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.spring.ch10.domain.ContactSummary;
import com.rajni.spring.ch10.service.ContactSummaryService;
import com.rajni.spring.ch10.service.jpa.ContactSummaryUntypeImpl;

/**
 * @author rajni.ubhi
 *
 */
public class ContactSummarySample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/spring/ch10/app-context.xml");
		ctx.refresh();
		
		ContactSummaryUntypeImpl untypeImpl = ctx.getBean("ContactSummaryUntype",ContactSummaryUntypeImpl.class);
		untypeImpl.displayAllContcatSummary();
		
		ContactSummaryService summary = ctx.getBean("contactSummaryService", ContactSummaryService.class);
		
		List<ContactSummary> cList = summary.findAll();
		for(ContactSummary c : cList) {
			System.out.println(c);
		}
	}

}
