/**
 * 
 */
package com.rajni.springbasics.profile;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class ProfileXmlConfigExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles("kindergarten");
		ctx.load("classpath:com/rajni/springbasics/profile/**/*-config.xml");
		ctx.refresh();
		FoodProviderService service = ctx.getBean("foodProviderService", FoodProviderService.class);
		System.out.println(service.provideLunchSet());
		
		for(Food food : service.provideLunchSet()) {
			System.out.println(food.getName());
		}
	}

}
