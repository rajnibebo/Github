/**
 * 
 */
package com.rajni.spring.aop;

/**
 * @author rajni.ubhi
 *
 */
public class ErrorBean {
	public void errorProne() throws Exception {
		System.out.println("Going to throw from errorProne");
		throw new Exception("errorProne()");
	}
	
	public void otherErrorProneMethod() throws IllegalArgumentException{
		System.out.println("Going to throw from otherErrorProneMethod");
		throw new IllegalArgumentException("otherErrorProneMethod()");
	}
	
}
