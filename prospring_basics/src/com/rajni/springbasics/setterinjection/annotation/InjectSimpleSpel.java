/**
 * 
 */
package com.rajni.springbasics.setterinjection.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author rajni.ubhi
 *
 */
@Service("injectSpel")
public class InjectSimpleSpel {
	@Value("#{config.name}")
	private String name;
	@Value("#{config.age+1}")
	private int age;
	@Value("#{config.height}")
	private float height;
	@Value("#{config.ageInSeconds}")
	private Long ageInSeconds;
	@Value("#{config.isProgrammer}")
	private boolean programmer;
	
	
	public String toString() {
		return "InjectSimpleSpel : Name : "+name;
	}
}
