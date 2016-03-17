/**
 * 
 */
package com.rajni.springbasics.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class SimpleBeanWithJSR250 {
private static String DEFAULT_NAME = "Rajni";
	
	private String name = null;
	private Integer age = Integer.MIN_VALUE;
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
		System.out.println("Setter called for name !!");
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name : "+name+" , age : "+age;
	}
	
	@PostConstruct
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Inside init JSR-250() !!!!");
		if(name == null) {
			System.out.println("Assigning name in init JSR-250() method");
			name = DEFAULT_NAME;
		}
		
		if(age == Integer.MIN_VALUE ) {
			System.out.println("Dependency has not yet been invoked correctly.");
			throw new IllegalArgumentException();
		}
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/lifecycle/app-context.xml");
		ctx.refresh();
		SimpleBeanWithJSR250 bean1 = getBean("bean7", ctx);
		System.out.println(bean1);
		SimpleBeanWithJSR250 bean2 = getBean("bean8", ctx);
		System.out.println(bean2);
		SimpleBeanWithJSR250 bean3 = getBean("bean9", ctx);
		System.out.println(bean3);
	}
	
	private static SimpleBeanWithJSR250 getBean(String name , ApplicationContext ctx) {
		try {
			SimpleBeanWithJSR250 bean = (SimpleBeanWithJSR250) ctx.getBean(name);
		//	System.out.println(bean);
			return bean;
		} catch(BeanCreationException e) {
			e.printStackTrace();
		}
		return null;
	}

}
