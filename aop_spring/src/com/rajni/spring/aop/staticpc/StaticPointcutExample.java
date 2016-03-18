/**
 * 
 */
package com.rajni.spring.aop.staticpc;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * @author rajni.ubhi
 *
 */
public class StaticPointcutExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanOne one = new BeanOne();
		BeanOne two = new BeanOne();
		
		BeanOne proxy1 ;
		BeanOne proxy2;
		
		Pointcut pc = new SimpleStaticPointcut();
		Advice advice = new SimpleAdvice();
		Advisor advisor = new DefaultPointcutAdvisor(pc,advice);
		
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvisor(advisor);
		pf.setTarget(one);
		proxy1 = (BeanOne) pf.getProxy();
		
		
		pf = new ProxyFactory();
		pf.addAdvisor(advisor);
		pf.setTarget(two);
		proxy2 = (BeanOne) pf.getProxy();
		
		proxy1.foo();
		proxy2.foo();
		
		proxy1.bar();
		proxy2.bar();
		
	}

}
