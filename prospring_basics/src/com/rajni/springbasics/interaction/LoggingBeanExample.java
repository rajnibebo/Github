/**
 * 
 */
package com.rajni.springbasics.interaction;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class LoggingBeanExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/interaction/logging.xml");
		ctx.refresh();
		
		LoggingBean log = (LoggingBean) ctx.getBean("logBean");
		log.someOperation();
	}

}
