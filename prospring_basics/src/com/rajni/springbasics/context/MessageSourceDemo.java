/**
 * 
 */
package com.rajni.springbasics.context;

import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class MessageSourceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/context/messageSource.xml");
		ctx.refresh();
		
		Locale english = Locale.ENGLISH;
		Locale czech = new Locale("cs", "CZ");
		
		System.out.println(ctx.getMessage("msg", null, english));
		System.out.println(ctx.getMessage("msg", null, czech));
		System.out.println(ctx.getMessage("nameMsg", new String[] {"Rajni","Ubhi"},english));
		
		ctx.close();
	}

}
