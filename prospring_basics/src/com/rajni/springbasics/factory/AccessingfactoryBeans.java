/**
 * 
 */
package com.rajni.springbasics.factory;

import java.security.MessageDigest;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class AccessingfactoryBeans {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/factory/factory.xml");
		ctx.refresh();
		
		MessageDigest digest = (MessageDigest) ctx.getBean("shaDigest");
		MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean) ctx.getBean("&shaDigest");
		
		try {
			MessageDigest factoryDigest = (MessageDigest) factoryBean.getObject();
			System.out.println(factoryDigest.digest("Hello World".getBytes()));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(digest);
		ctx.close();
	}

}
