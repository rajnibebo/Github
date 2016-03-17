/**
 * 
 */
package com.rajni.springbasics.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class ProfileJavaConfigExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("highschool");
		ctx.register(KinderGartenConfig.class , HighSchoolConfig.class);
		ctx.refresh();
		
		FoodProviderService service = ctx.getBean("foodProviderServiceImpl", FoodProviderService.class);
		System.out.println(service.provideLunchSet());
		
		for(Food food : service.provideLunchSet()) {
			System.out.println(food.getName());
		}
	}

}
