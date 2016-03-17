/**
 * 
 */
package com.rajni.springbasics.pe;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class CustomEditorExample {

	private Name name;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/pe/builtin.xml");
		ctx.refresh();
		
		CustomEditorExample editor = (CustomEditorExample) ctx.getBean("example");
		System.out.println(editor.getName());
		
		ctx.close();
	}

	public void setName(Name name) {
		System.out.println("Setting name in CustomEditorExample");
		this.name = name;
	}
	
	public Name getName() {
		return name;
	}
}
