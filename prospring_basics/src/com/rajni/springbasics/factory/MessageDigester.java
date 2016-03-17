/**
 * 
 */
package com.rajni.springbasics.factory;

import java.security.MessageDigest;

/**
 * @author rajni.ubhi
 *
 */
public class MessageDigester {
	private MessageDigest digest1 = null;
	private MessageDigest digest2 = null;
	
	/**
	 * @param digest1 the digest1 to set
	 */
	public void setDigest1(MessageDigest digest1) {
		System.out.println("Setting digest1");
		this.digest1 = digest1;
	}
	/**
	 * @param digest2 the digest2 to set
	 */
	public void setDigest2(MessageDigest digest2) {
		System.out.println("Setting digest2");
		this.digest2 = digest2;
	}
	
	public void digest(String message) {
		System.out.println("Using digest1");
		digest(message, digest1);
		System.out.println("Using digest2");
		digest(message, digest2);
	}
	
	private void digest(String msg ,  MessageDigest digest) {
		System.out.println("Using algorithm "+digest.getAlgorithm());
		digest.reset();
		byte[] bytes = msg.getBytes();
		byte[] out = digest.digest(bytes);
		System.out.println(out);
		
	}
}
