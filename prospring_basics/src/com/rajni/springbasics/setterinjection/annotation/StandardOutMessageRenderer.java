/**
 * 
 */
package com.rajni.springbasics.setterinjection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.rajni.springbasics.setterinjection.xml.MessageProvider;
import com.rajni.springbasics.setterinjection.xml.MessageRenderer;

/**
 * @author rajni.ubhi
 *
 */
@Service("renderer")
class StandardOutMessageRenderer implements MessageRenderer {
	@Autowired
	private MessageProvider messageProvider;
	
	/* (non-Javadoc)
	 * @see com.rajni.springbasics.setterinjection.xml.MessageRenderer#setMessageProvider(com.rajni.springbasics.setterinjection.xml.MessageProvider)
	 */
	@Override
	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		this.messageProvider = provider;
	}

	/* (non-Javadoc)
	 * @see com.rajni.springbasics.setterinjection.xml.MessageRenderer#getMessageProvider()
	 */
	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return messageProvider;
	}

	/* (non-Javadoc)
	 * @see com.rajni.springbasics.setterinjection.xml.MessageRenderer#render()
	 */
	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(messageProvider.getMessage());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/setterinjection/annotation/app-context.xml");
		ctx.refresh();
		
		MessageRenderer rendrer = (MessageRenderer) ctx.getBean("renderer");
		rendrer.render();
		
		MessageProvider provider = (MessageProvider) ctx.getBean("msgPro");
		System.out.println(provider.getMessage());
		
		InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
		System.out.println(simple);
		
		InjectSimpleConfig config = (InjectSimpleConfig) ctx.getBean("config");
		System.out.println(config);
		
		InjectSimpleSpel spel = (InjectSimpleSpel) ctx.getBean("injectSpel");
		System.out.println(spel);
		
		CollectionInjection coll = (CollectionInjection) ctx.getBean("collection");
		System.out.println(coll);
		
		ctx.close();

	}

}
