/**
 * 
 */
package com.rajni.springbasics.javaconfig;

/**
 * @author rajni.ubhi
 *
 */
class HelloWorldMessageProvider implements MessageProvider{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World from java config";
	}

}
