/**
 * 
 */
package com.rajni.springbasics.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rajni.springbasics.profile.highschool.FoodProviderServiceImpl;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
@Profile(value="highschool")
public class HighSchoolConfig {

	@Bean
	public FoodProviderService foodProviderServiceImpl() {
		return new FoodProviderServiceImpl();
	}
}
