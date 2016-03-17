/**
 * 
 */
package com.rajni.springbasics.mi;

/**
 * @author rajni.ubhi
 *
 */
public abstract class AbstractLookupBean implements DemoBean{
	public abstract MyHelper getMyHelper();
	
	public void someOperation() {
		getMyHelper().doSomethingUseful();
	}
}
