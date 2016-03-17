/**
 * 
 */
package com.rajni.springbasics.factory;

import java.security.MessageDigest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author rajni.ubhi
 *
 */
public class MessageDigestFactoryBean implements FactoryBean<MessageDigest> , InitializingBean{

	private String algorithmName = "MD5";
	private MessageDigest messageDigest = null;
	
	@Override
	public MessageDigest getObject() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Retrieving object");
		return messageDigest;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return MessageDigest.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		messageDigest = MessageDigest.getInstance(algorithmName);
	}

	/**
	 * @return the algorithmName
	 */
	public String getAlgorithmName() {
		return algorithmName;
	}

	/**
	 * @param algorithmName the algorithmName to set
	 */
	public void setAlgorithmName(String algorithmName) {
		System.out.println("Setting algorithm name");
		this.algorithmName = algorithmName;
	}

	
}
