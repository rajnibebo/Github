/**
 * 
 */
package com.rajni.springbasics.jsr330;

/**
 * @author rajni.ubhi
 *
 */
public interface MessageRenderer {
	public MessageProvider getMessageProvider();
	public void setMessageProvider(MessageProvider provider);
	public void render();
}
