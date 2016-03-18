/**
 * 
 */
package com.rajni.spring.aop.security;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author rajni.ubhi
 *
 */
public class SecurityAdvice implements MethodBeforeAdvice{

	private SecurityManager securityManager;
	
	public SecurityAdvice() {
		// TODO Auto-generated constructor stub
		this.securityManager = new SecurityManager();
	}
	
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		UserInfo user = securityManager.getLoggedOnUser();
		if(user == null) {
			System.out.println("No user logged in , you need user to login first");
			throw new SecurityException("You must login first");
		} else if(user.getUserName().equals("Rajni")) {
			System.out.println("Logged in as Rajni");
		} else {
			System.out.println("It's not a valid user !!!");
			throw new SecurityException("User details are invalid : "+user);
		}
	}

}
