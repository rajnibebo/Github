/**
 * 
 */
package com.rajni.springbasics.lifecycle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class DestructiveBeanWithInterface implements DisposableBean , InitializingBean{
	private InputStream is = null;
	private String filePath = null;
	
	
	/**
	 * @return the is
	 */
	public InputStream getIs() {
		return is;
	}

	/**
	 * @param is the is to set
	 */
	public void setIs(InputStream is) {
		this.is = is;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		if(filePath == null) {
			throw new IllegalArgumentException("File path is null");
		}
		System.out.println("Path found");
		is = new FileInputStream(filePath);
	}
	
	public void destroy() throws Exception{
		System.out.println("Inside destroy()");
		if(is != null) {
			try {
				is.close();
				is = null;
				System.out.println("Destroyed the inputStream context");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String toString() {
		return "DestroyBean with path : "+filePath;
	}

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/lifecycle/app-context.xml");
		ctx.refresh();
		DestructiveBeanWithInterface bean1 = getBean("desBean3", ctx);
		System.out.println(bean1);
		ctx.destroy();
	}
	
	private static DestructiveBeanWithInterface getBean(String name , ApplicationContext ctx) {
		try {
			DestructiveBeanWithInterface bean = (DestructiveBeanWithInterface) ctx.getBean(name);
		//	System.out.println(bean);
			return bean;
		} catch(BeanCreationException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
