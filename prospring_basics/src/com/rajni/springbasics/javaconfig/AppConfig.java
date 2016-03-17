/**
 * 
 */
package com.rajni.springbasics.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
public class AppConfig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MessageRenderer renderer = (MessageRenderer) ctx.getBean("messageRenderer",MessageRenderer.class);
		renderer.render();
	}
	
	@Bean
	public MessageProvider getMessageProvider() {
		System.out.println("getting messageProvider");
		return new HelloWorldMessageProvider();
	}
	
	@Bean
	public MessageRenderer messageRenderer() {
		System.out.println("configuring messageRenderer");
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(getMessageProvider());
		return renderer;
	}

}
