/**
 * 
 */
package com.rajni.spring.aop.staticpc;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

/**
 * @author rajni.ubhi
 *
 */
public class SimpleStaticPointcut extends StaticMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> arg1) {
		// TODO Auto-generated method stub
		return method.getName().equals("foo");
	}

}
