/**
 * 
 */
package com.rajni.springbasics.setterinjection.xml;

/**
 * @author rajni.ubhi
 *
 */
public interface MessageRenderer {
	public void setMessageProvider(MessageProvider provider);
	public MessageProvider getMessageProvider();
	public void render();
}
