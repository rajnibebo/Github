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
@Service("injectSimple")
class InjectSimple {
	@Value("Rajni")
	private String name;
	@Value("21")
	private int age;
	@Value("1000009")
	private Long ageInSeconds;
	@Value("53")
	private float height;
	@Value("true")
	private boolean programmer;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("setName called()");
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		System.out.println("setAge() called");
		this.age = age;
	}
	/**
	 * @return the ageInSeconds
	 */
	public Long getAgeInSeconds() {
		return ageInSeconds;
	}
	/**
	 * @param ageInSeconds the ageInSeconds to set
	 */
	public void setAgeInSeconds(Long ageInSeconds) {
		System.out.println("setAgeInSeconds() called");
		this.ageInSeconds = ageInSeconds;
	}
	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		System.out.println("setHeight() called");
		this.height = height;
	}
	/**
	 * @return the programmer
	 */
	public boolean isProgrammer() {
		return programmer;
	}
	/**
	 * @param programmer the programmer to set
	 */
	public void setProgrammer(boolean programmer) {
		System.out.println("setProgrammer() called");
		this.programmer = programmer;
	}
	
	public String toString() {
		return "Name : "+name;
	}
}
