/**
 * 
 */
package com.rajni.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author rajni.ubhi
 *
 */
public class SimpleAfterReturningAdvise implements AfterReturningAdvice{

	public static void main(String[] args) {
		MessageWriter writer = new MessageWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleAfterReturningAdvise());
		pf.setTarget(writer);
		
		MessageWriter proxy = (MessageWriter) pf.getProxy();
		proxy.writeMessage();
		
	}
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("After method : "+arg1.getName());
	}

}
