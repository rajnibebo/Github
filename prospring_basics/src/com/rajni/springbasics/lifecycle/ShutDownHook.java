/**
 * 
 */
package com.rajni.springbasics.lifecycle;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class ShutDownHook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/lifecycle/app-context.xml");
		ctx.registerShutdownHook();
		ctx.refresh();
		DestructiveBeanWithJSR250 bean1 = getBean("desBean4", ctx);
		System.out.println(bean1);
		
		/*DestructiveBeanWithJSR250 bean2 = getBean("desBean5", ctx);
		System.out.println(bean2);*/

	}
	
	private static DestructiveBeanWithJSR250 getBean(String name , ApplicationContext ctx) {
		try {
			DestructiveBeanWithJSR250 bean = (DestructiveBeanWithJSR250) ctx.getBean(name);
		//	System.out.println(bean);
			return bean;
		} catch(BeanCreationException e) {
			e.printStackTrace();
		}
		return null;
	}

}
