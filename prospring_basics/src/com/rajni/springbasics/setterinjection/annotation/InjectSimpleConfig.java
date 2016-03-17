/**
 * 
 */
package com.rajni.springbasics.setterinjection.annotation;

import org.springframework.stereotype.Service;

/**
 * @author rajni.ubhi
 *
 */
@Service("config")
class InjectSimpleConfig {
	private String name = "Rajni";
	private int age=22;
	private float height = 5.4f;
	private Long ageInSeconds = 1000000l;
	private boolean isProgrammer = true;
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("Inside getter of getName()");
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("Inside setter setName()");
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
		this.age = age;
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
		this.height = height;
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
		this.ageInSeconds = ageInSeconds;
	}



	/**
	 * @return the isProgrammer
	 */
	public boolean getIsProgrammer() {
		return isProgrammer;
	}



	/**
	 * @param isProgrammer the isProgrammer to set
	 */
	public void setIsProgrammer(boolean isProgrammer) {
		this.isProgrammer = isProgrammer;
	}



	public String toString() {
		return "InjectSimpleConfig : Name :"+name;
	}
}
