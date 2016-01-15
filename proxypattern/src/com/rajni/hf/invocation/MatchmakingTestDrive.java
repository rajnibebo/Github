/**
 * 
 */
package com.rajni.hf.invocation;

import java.lang.reflect.Proxy;

/**
 * @author rajni.ubhi
 * 
 */
public class MatchmakingTestDrive {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		MatchmakingTestDrive drive = new MatchmakingTestDrive();
		drive.drive();
	}
	
	public void drive() throws ClassNotFoundException {
		PersonBean bean = initialize();
		PersonBean proxy = getNoOwnerProxy(bean);
		System.out.println("Name is : "+proxy.getName());
		proxy.setInterests("Java Programming");
		try {
			proxy.setHotOrNotRating(11);
		} catch(Exception e) {
			System.out.println("can not set Rating !!! Sorry");
		}
		System.out.println("Rating :"+proxy.getHotOrNotRating());
	}

	public PersonBean getOwnerProxy(PersonBean bean) throws ClassNotFoundException {
		Object o =  Proxy.newProxyInstance(PersonBeanImpl.class
				.getClassLoader(), new Class<?>[] { PersonBean.class },
				new OwnerInvocationHandler(bean));
		return (PersonBean) o;
	}
	
	public PersonBean getNoOwnerProxy(PersonBean bean) {
		return (PersonBean) Proxy.newProxyInstance(bean.getClass()
				.getClassLoader(), bean.getClass().getInterfaces(),
				new NoOwnerInvocationHandler(bean));
	}
	
	public PersonBean initialize() {
		PersonBean bean = new PersonBeanImpl();
		bean.setGender("female");
		bean.setHotOrNotRating(10);
		bean.setInterests("Listening music");
		bean.setName("Rajni");
		return bean;
	}
}
