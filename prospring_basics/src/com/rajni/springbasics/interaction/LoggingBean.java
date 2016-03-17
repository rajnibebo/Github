/**
 * 
 */
package com.rajni.springbasics.interaction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @author rajni.ubhi
 *
 */
public class LoggingBean implements BeanNameAware{

	private static Log log = LogFactory.getLog(LoggingBean.class);
	private String beanName = null;
	
	
	public LoggingBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor called");
	}
	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Setting Bean name");
		this.beanName = beanName;
	}

	
	public void someOperation() {
		if(log.isInfoEnabled()) {
			log.info("Bean ["+beanName+"] in someOperation()" );
		}
	}
}
