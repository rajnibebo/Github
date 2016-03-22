/**
 * 
 */
package com.rajni.spring.aop.advanced.aspectjannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author rajni.ubhi
 *
 */
@Component("myBean")
public class MyBean {
	private MyDependency dep;
	
	@Autowired
	public void setDep(MyDependency myDependency) {
		this.dep = myDependency;
	}
	
	public void execute() {
		dep.foo(100);
		dep.foo(500);
		dep.bar();
	}
}
