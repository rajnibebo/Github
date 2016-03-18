/**
 * 
 */
package com.rajni.spring.aop.crypto;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author rajni.ubhi
 *
 */
public class AfterAdviceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyGenerator keyGen = getKeyGenerator();
		
		for(int i = 0 ; i <10 ; i++) {
			try {
				long key = keyGen.getKey();
				System.out.println(key);
			} catch(SecurityException e) {
				System.out.println("Weak key generated from catch");
			}
			
		}
	}
	
	private static KeyGenerator getKeyGenerator() {
		KeyGenerator target = new KeyGenerator();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvice(new WeakKeyCheckAdvice());
		return (KeyGenerator) pf.getProxy();
	}

}
