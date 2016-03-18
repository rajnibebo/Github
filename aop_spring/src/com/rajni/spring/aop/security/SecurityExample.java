/**
 * 
 */
package com.rajni.spring.aop.security;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author rajni.ubhi
 *
 */
public class SecurityExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecurityManager manager = new SecurityManager();
		SecureBean bean = getSecureBean();
		
		manager.login("Rajni", "rajni");
		bean.writeSecureMessage();
		manager.logout();
		
		try {
			manager.login("Rajni1", "rajni");
			bean.writeSecureMessage();
		} catch(SecurityException e) {
			manager.logout();
		}
		
		try {
			bean.writeSecureMessage();
		} catch(SecurityException e) {
			manager.logout();
		}
	}

	private static SecureBean getSecureBean() {
		SecureBean target = new SecureBean();
		SecurityAdvice advice = new SecurityAdvice();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvice(advice);
		
		SecureBean proxy = (SecureBean) pf.getProxy();
		return proxy;
	}
}
