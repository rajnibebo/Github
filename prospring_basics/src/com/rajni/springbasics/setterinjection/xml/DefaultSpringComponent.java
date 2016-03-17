/**
 * 
 */
package com.rajni.springbasics.setterinjection.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class DefaultSpringComponent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/setterinjection/xml/app-context.xml");
		ctx.refresh();
		
		MessageRenderer rendrer = (MessageRenderer) ctx.getBean("renderer");
		rendrer.render();
		
		MessageRenderer rendrer1 = (MessageRenderer) ctx.getBean("msgRender");
		rendrer1.render();
		
		MessageProvider provider = (MessageProvider) ctx.getBean("confProvider1");
		System.out.println(provider.getMessage());
		
		MessageProvider provider1 = (MessageProvider) ctx.getBean("confProvider2");
		System.out.println(provider1.getMessage());
		
		InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
		System.out.println(simple);
		ctx.close();
	}

}
