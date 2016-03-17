/**
 * 
 */
package com.rajni.springbasics.javaconfig;

/**
 * @author rajni.ubhi
 *
 */
interface MessageRenderer {
	public MessageProvider getMessageProvider();
	public void setMessageProvider(MessageProvider provider);
	public void render();
}
