/**
 * 
 */
package com.rajni.springbasics.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rajni.springbasics.profile.kindergarten.FoodProviderServiceImpl;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
@Profile(value="kindergarten")
public class KinderGartenConfig {
	@Bean
	public FoodProviderService foodProviderServiceImpl() {
		return new FoodProviderServiceImpl();
	}
}
