/**
 * 
 */
package com.rajni.spring.aop.advanced.aspectjannotation;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class AspectjAnnotationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/spring/aop/advanced/aspectjannotation/aspectjannotations.xml");
		ctx.refresh();
		
		MyBean bean = (MyBean) ctx.getBean("myBean");
		bean.execute();
	}

}
