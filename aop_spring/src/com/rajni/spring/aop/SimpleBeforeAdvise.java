/**
 * 
 */
package com.rajni.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author rajni.ubhi
 *
 */
public class SimpleBeforeAdvise implements MethodBeforeAdvice{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleBeforeAdvise());
		
		MessageWriter target = new MessageWriter();
		pf.setTarget(target);
		
		MessageWriter proxy = (MessageWriter) pf.getProxy();
		proxy.writeMessage();
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before method :"+arg0.getName());
	}

}
