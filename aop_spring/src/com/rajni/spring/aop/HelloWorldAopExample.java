/**
 * 
 */
package com.rajni.spring.aop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author rajni.ubhi
 *
 */
public class HelloWorldAopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageWriter target = new MessageWriter();
		ProxyFactory pf = new ProxyFactory();
		
		pf.addAdvice(new MessageDecorator());
		pf.setTarget(target);
		
		MessageWriter proxy = (MessageWriter) pf.getProxy();
		
		target.writeMessage();
		System.out.println();
		System.out.println();
		proxy.writeMessage();
		
		
	}

}
