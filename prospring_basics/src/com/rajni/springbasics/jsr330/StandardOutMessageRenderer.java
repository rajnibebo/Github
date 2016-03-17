/**
 * 
 */
package com.rajni.springbasics.jsr330;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * @author rajni.ubhi
 *
 */
@Named("renderer")
@Singleton
public class StandardOutMessageRenderer implements MessageRenderer{

	@Inject
	@Named("confProvider")
	private MessageProvider provider;
	
	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return provider;
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		System.out.println("Setting messageProvider");
		// TODO Auto-generated method stub
		this.provider = provider;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("Inside render");
		if(provider != null) {
			System.out.println("inside provider !=  null");
			System.out.println(provider.getMessage());
			return;
		}
		throw new IllegalArgumentException("Provider is null");
	}

}
