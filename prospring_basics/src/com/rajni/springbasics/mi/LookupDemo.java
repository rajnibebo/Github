/**
 * 
 */
package com.rajni.springbasics.mi;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class LookupDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("com/rajni/springbasics/mi/app-context.xml");
		ctx.refresh();
		
		DemoBean demo1 = (DemoBean) ctx.getBean("standardBean");
		MyHelper helper1 = demo1.getMyHelper();
		DemoBean demo2 = (DemoBean) ctx.getBean("standardBean");
		MyHelper helper2 = demo2.getMyHelper();
		System.out.println((demo1 == demo2) +" AND "+(helper1 == helper2));
		
		DemoBean demo3 = (DemoBean) ctx.getBean("lookupBean");
		MyHelper helper3 = demo3.getMyHelper();
		DemoBean demo4 = (DemoBean) ctx.getBean("lookupBean");
		MyHelper helper4 = demo4.getMyHelper();
		System.out.println((demo3 == demo4) +" AND "+(helper3 == helper4));
		
		ReplacementTarget target1 = (ReplacementTarget) ctx.getBean("replacementTarget");
		target1.display();
		
		ReplacementTarget target2 = (ReplacementTarget) ctx.getBean("standardReplacement");
		target2.display();
		
		ctx.close();
	}

}
