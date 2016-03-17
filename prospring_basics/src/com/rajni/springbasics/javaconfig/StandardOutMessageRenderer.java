/**
 * 
 */
package com.rajni.springbasics.javaconfig;

/**
 * @author rajni.ubhi
 *
 */
public class StandardOutMessageRenderer implements MessageRenderer{

	private MessageProvider provider;
	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return provider;
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		this.provider = provider;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		if(provider != null) {
			System.out.println(provider.getMessage());
			return;
		}
		throw new IllegalArgumentException();
	}

}
