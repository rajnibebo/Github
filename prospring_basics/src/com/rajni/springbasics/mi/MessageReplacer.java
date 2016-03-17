/**
 * 
 */
package com.rajni.springbasics.mi;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @author rajni.ubhi
 *
 */
public class MessageReplacer implements MethodReplacer {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.support.MethodReplacer#reimplement(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		String msg = "Rajni";
		System.out.println("This is reimplemented method : "+msg);
		return msg;
	}

}
