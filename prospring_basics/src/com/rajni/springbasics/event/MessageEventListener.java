/**
 * 
 */
package com.rajni.springbasics.event;

import org.springframework.context.ApplicationListener;

/**
 * @author rajni.ubhi
 *
 */
public class MessageEventListener implements ApplicationListener<MessageEvent>{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onApplicationEvent(MessageEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Received msg : "+event.getMessage());
	}

}
