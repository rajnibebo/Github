/**
 * 
 */
package com.rajni.springbasics.setterinjection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajni.springbasics.setterinjection.xml.MessageProvider;

/**
 * @author rajni.ubhi
 *
 */
@Service("msgPro")
class ConfigurableMessage implements MessageProvider{
	private String message;
	
	/*@Autowired
	public ConfigurableMessage(@Value("My Name is rajni") String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}*/
	
	/*@Autowired
	ConfigurableMessage(String msg) {
		// TODO Auto-generated constructor stub
		this.message = msg;
	}
	*/
	@Autowired
	public ConfigurableMessage(String msg , String num) {
		// TODO Auto-generated constructor stub
		this.message = msg;
		System.out.println("Another constructor ran !! with msg : "+msg+" , num : "+num);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
