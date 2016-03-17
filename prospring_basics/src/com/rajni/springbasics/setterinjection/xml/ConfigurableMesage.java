/**
 * 
 */
package com.rajni.springbasics.setterinjection.xml;

/**
 * @author rajni.ubhi
 *
 */
class ConfigurableMesage implements MessageProvider{

	private String message;
	
	public ConfigurableMesage(String msg) {
		// TODO Auto-generated constructor stub
		this.message = msg;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
