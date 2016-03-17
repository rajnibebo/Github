/**
 * 
 */
package com.rajni.springbasics.jsr330;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class Jsr330Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/jsr330/jsr330.xml");
		ctx.refresh();
		
		MessageRenderer renderer = ctx.getBean("renderer" , MessageRenderer.class);
		renderer.render();
	}

}
