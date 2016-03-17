/**
 * 
 */
package com.rajni.springbasics.javaconfig;

/**
 * @author rajni.ubhi
 *
 */
class ConfigurableMessageProvider implements MessageProvider{

	private String message;
	
	public ConfigurableMessageProvider(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	

}
