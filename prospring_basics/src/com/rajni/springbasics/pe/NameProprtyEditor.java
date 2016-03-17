/**
 * 
 */
package com.rajni.springbasics.pe;

import java.beans.PropertyEditorSupport;

/**
 * @author rajni.ubhi
 *
 */
public class NameProprtyEditor extends PropertyEditorSupport{
	public void setAsText(String text) throws IllegalArgumentException{
		System.out.println("Inside SetAsText()");
		String[] names = text.split("\\s");
		Name name = new Name(names[0],names[1]);
		setValue(name);
	}
	
}
