/**
 * 
 */
package com.rajni.springbasics.setterinjection.xml;

/**
 * @author rajni.ubhi
 *
 */
public class StandardOutMessageRenderer implements MessageRenderer{

	private MessageProvider provider;
	
	@Override
	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		System.out.println("Overridden setter called !!");
		this.provider = provider;
	}
	
	public void setProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		System.out.println("Second setter called !!");
		this.provider = provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return provider;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		if(provider != null) {
			System.out.println(provider.getMessage());
			return;
		}
		System.exit(1);
	}

}
