/**
 * 
 */
package com.rajni.springbasics.jsr330;

import javax.inject.Inject;
import javax.inject.Named;


/**
 * @author rajni.ubhi
 *
 */
@Named("confProvider")
public class ConfigurableMessageProvider implements MessageProvider{

	private String message = "Default Message !!!!!";
	
	
	public ConfigurableMessageProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Inject
	@Named("message")
	public ConfigurableMessageProvider(String message) {
		// TODO Auto-generated constructor stub
		System.out.println("configuring");
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
