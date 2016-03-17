/**
 * 
 */
package com.rajni.springbasics.factory;

import java.security.MessageDigest;

/**
 * @author rajni.ubhi
 *
 */
public class MessageDigestFactory {

	private String algorithmName = "MD5";
	
	public MessageDigest createInstance() throws Exception {
		System.out.println("Creating instance");
		return MessageDigest.getInstance(algorithmName);
	}
	/**
	 * @param algorithmName the algorithmName to set
	 */
	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

}
