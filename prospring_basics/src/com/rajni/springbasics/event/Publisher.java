/**
 * 
 */
package com.rajni.springbasics.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class Publisher implements ApplicationContextAware{

	private ApplicationContext ctx;
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("com/rajni/springbasics/event/events.xml");
		
		Publisher publisher = (Publisher) ctx.getBean("publisher");
		publisher.publish("My name is Rajni");
		publisher.publish("Hello World !!!!!!!!");
		
		
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setting context");
		this.ctx = ctx;
	}
	
	public void publish(String message) {
		ctx.publishEvent(new MessageEvent(this, message));
	}

}
