/**
 * 
 */
package com.rajni.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author rajni.ubhi
 *
 */
public class SimpleThrowsAdvice implements ThrowsAdvice{
	
	public static void main(String[] args) {
		ErrorBean bean = new ErrorBean();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(bean);
		pf.addAdvice(new SimpleThrowsAdvice());
		
		ErrorBean proxy = (ErrorBean) pf.getProxy();
		try {
			proxy.errorProne();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		try {
			proxy.otherErrorProneMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	public void afterThrowing(Exception e) throws Throwable {
		System.out.println("*****");
		System.out.println("Generic Exception caught");
		System.out.println("Caught : "+e.getClass().getName());
		System.out.println("*****\n");
	}
	
	public void afterThrowing(Method m , Object[] args , Object target , IllegalArgumentException e) throws Throwable {
		System.out.println("*****");
		System.out.println("Illegal Exception caught");
		System.out.println("Caught : "+e.getClass().getName());
		System.out.println("Method name : "+m.getName());
		System.out.println("*****\n");
	}
}
