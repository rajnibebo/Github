/**
 * 
 */
package com.rajni.spring.aop.advanced.aspectjannotation;

import org.springframework.stereotype.Component;

/**
 * @author rajni.ubhi
 *
 */
@Component("myDependency")
public class MyDependency {
	public void foo(int x) {
		System.out.println("foo(int x) x :"+x);
	}
	
	public void bar() {
		System.out.println("bar()");
	}
}
