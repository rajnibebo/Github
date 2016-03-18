/**
 * 
 */
package com.rajni.spring.aop.profiling;

/**
 * @author rajni.ubhi
 * 
 */
public class WorkBean {
	public void doSomeWork(int numOfTimes) {
		for (int i = 0; i < numOfTimes; i++) {
			System.out.print("Rajni ");
		}
	}

}
