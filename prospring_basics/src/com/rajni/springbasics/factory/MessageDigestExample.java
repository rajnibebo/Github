/**
 * 
 */
package com.rajni.springbasics.factory;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class MessageDigestExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/factory/factory.xml");
		ctx.refresh();
		
		MessageDigester digester = (MessageDigester) ctx.getBean("digest");
		digester.digest("Hey my name is Rajni");
	}

}
