/**
 * 
 */
package com.rajni.hf.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author rajni.ubhi
 *
 */
public class OwnerInvocationHandler implements InvocationHandler{
	PersonBean personBean;
	
	public OwnerInvocationHandler() {
		// TODO Auto-generated constructor stub
	}
	public OwnerInvocationHandler(PersonBean bean) {
		// TODO Auto-generated constructor stub
		this.personBean = bean;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		// TODO Auto-generated method stub
		try {
			String name = method.getName();
			if(name.startsWith("get")) {
				method.invoke(personBean, args);
			} else if (name.equals("setHotOrNotRating")) {
				throw new IllegalAccessException();
			} else if (name.startsWith("set")) {
				method.invoke(personBean, args);
			}
		} catch(Exception e) {
			
		}
		return null;
	}

}
