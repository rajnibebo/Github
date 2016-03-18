/**
 * 
 */
package com.rajni.spring.aop.crypto;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author rajni.ubhi
 *
 */
public class WeakKeyCheckAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		if(target instanceof KeyGenerator && method.getName().equals("getKey")) {
			long key = ((Long) returnValue).longValue();
			if(key == KeyGenerator.WEAK_KEY) {
				throw new SecurityException("Weak key generated !!!");
			}
		}
	}

}
