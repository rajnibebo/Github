/**
 * 
 */
package com.rajni.springbasics.mi;

/**
 * @author rajni.ubhi
 *
 */
public class StandardLookupDemoBean implements DemoBean {

	private MyHelper helper;
	
	public void setHelper(MyHelper helper) {
		this.helper = helper;
	}
	/* (non-Javadoc)
	 * @see com.rajni.springbasics.mi.DemoBean#getMyHelper()
	 */
	@Override
	public MyHelper getMyHelper() {
		// TODO Auto-generated method stub
		return helper;
	}

	/* (non-Javadoc)
	 * @see com.rajni.springbasics.mi.DemoBean#someOperation()
	 */
	@Override
	public void someOperation() {
		// TODO Auto-generated method stub
		helper.doSomethingUseful();
	}

}
