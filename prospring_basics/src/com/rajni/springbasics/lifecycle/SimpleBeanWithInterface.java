/**
 * 
 */
package com.rajni.springbasics.lifecycle;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class SimpleBeanWithInterface implements InitializingBean{
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
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterPropertiesSet() !!!!");
		if(name == null) {
			System.out.println("Assigning name in afterPropertiesSet() method");
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
		SimpleBeanWithInterface bean1 = getBean("bean4", ctx);
		System.out.println(bean1);
		SimpleBeanWithInterface bean2 = getBean("bean5", ctx);
		System.out.println(bean2);
		SimpleBeanWithInterface bean3 = getBean("bean6", ctx);
		System.out.println(bean3);
	}
	
	private static SimpleBeanWithInterface getBean(String name , ApplicationContext ctx) {
		try {
			SimpleBeanWithInterface bean = (SimpleBeanWithInterface) ctx.getBean(name);
		//	System.out.println(bean);
			return bean;
		} catch(BeanCreationException e) {
			e.printStackTrace();
		}
		return null;
	}

}
