/**
 * 
 */
package com.rajni.springbasics.setterinjection.annotation;

import org.springframework.stereotype.Service;

import com.rajni.springbasics.setterinjection.xml.MessageProvider;

/**
 * @author rajni.ubhi
 *
 */
@Service("messageProvider")
public class MessageProviderImpl implements MessageProvider {

	/* (non-Javadoc)
	 * @see com.rajni.springbasics.setterinjection.xml.MessageProvider#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "MessageProviderImpl invoked ";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
