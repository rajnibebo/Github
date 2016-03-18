/**
 * 
 */
package com.rajni.spring.aop.staticpc;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author rajni.ubhi
 *
 */
public class SimpleAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Invoking >>> "+invocation.getMethod().getName());
		
		Object returnVal = invocation.proceed();
		
		System.out.println(">>> Done");
		return returnVal;
	}

}
