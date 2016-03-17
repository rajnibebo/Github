/**
 * 
 */
package com.rajni.springbasics.resource;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class ResourceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/rajni/springbasics/event/events.xml");
		
		System.out.println(ctx.getResource("file://C:/Users/rajni.ubhi/Pictures"));
	}

}
