/**
 * 
 */
package com.rajni.spring.aop.profiling;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

/**
 * @author rajni.ubhi
 *
 */
public class ProfilingInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		StopWatch watch = new StopWatch();
		watch.start(invocation.getMethod().getName());
		Object returnValue = invocation.proceed();
		watch.stop();
		dumpInfo(invocation, watch.getTotalTimeMillis());
		return returnValue;
	}
	
	private void dumpInfo(MethodInvocation invocation , long ms) {
		Method m = invocation.getMethod();
		Object target = invocation.getThis();
		Object[] args = invocation.getArguments();
		
		System.out.println("Executed method : "+m.getName());
		System.out.println("On object of type : "+target.getClass().getName());
		
		System.out.println("With arguments");
		for(Object obj : args) {
			System.out.print(" "+obj);
		}
		System.out.println("\n");
		System.out.println("Took "+ms+" ms");
	}

}
