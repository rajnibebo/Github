/**
 * 
 */
package com.rajni.springbasics.setterinjection.xml;

/**
 * @author rajni.ubhi
 *
 */
class InjectSimple {
	private String name;
	private int age;
	private boolean programmer;
	private float height;
	private Long ageInSeconds;
	
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
		System.out.println("setName() setter called");
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
	 * @return the programmer
	 */
	public boolean isProgrammer() {
		return programmer;
	}
	/**
	 * @param programmer the programmer to set
	 */
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
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
	
	public String toString() {
		return "Name : "+name+"\n";
	}
}
