/**
 * 
 */
package com.rajni.springbasics.lifecycle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class DestructiveBeanWithJSR250 {

	private String filePath = null;
	private InputStream is = null;
	
	
	
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

	@PostConstruct
	public void init() throws FileNotFoundException {
		if(filePath == null) {
			throw new IllegalArgumentException("File path must be set");
		}
		is = new FileInputStream(filePath);
	}
	
	@PreDestroy
	public void destroy() {
		if(is != null) {
			try {
				is.close();
				is = null;
				System.out.println("Destroyed context");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String toString() {
		return "DestructiveBeanWithJSR250 : filePath : "+filePath;
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/lifecycle/app-context.xml");
		ctx.refresh();
		DestructiveBeanWithJSR250 bean1 = getBean("desBean4", ctx);
		System.out.println(bean1);
		
//		DestructiveBeanWithJSR250 bean2 = getBean("desBean5", ctx);
//		System.out.println(bean2);
		ctx.destroy();
	}
	
	private static DestructiveBeanWithJSR250 getBean(String name , ApplicationContext ctx) {
		try {
			DestructiveBeanWithJSR250 bean = (DestructiveBeanWithJSR250) ctx.getBean(name);
		//	System.out.println(bean);
			return bean;
		} catch(BeanCreationException e) {
			e.printStackTrace();
		}
		return null;
	}
}
