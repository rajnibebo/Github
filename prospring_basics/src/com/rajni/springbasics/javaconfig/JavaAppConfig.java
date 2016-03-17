/**
 * 
 */
package com.rajni.springbasics.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
@PropertySource(value="classpath:message.properties")
@ComponentScan(basePackages="{com.rajni.springbasics.javaconfig}")
@EnableTransactionManagement
public class JavaAppConfig {

	@Autowired
	Environment env;
	
	@Bean(name="provider")
	@Lazy(value=true)
	public MessageProvider messageProvider() {
		return new ConfigurableMessageProvider(env.getProperty("message"));
	}
	
	
	@Bean(name="renderer")
	@Scope(value="prototype")
	@DependsOn(value="provider")
	public MessageRenderer messageRenderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(messageProvider());
		return renderer;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaAppConfig.class);
		System.out.println(ctx);
		MessageRenderer renderer = (MessageRenderer) ctx.getBean("renderer");
		renderer.render();
	}
}
