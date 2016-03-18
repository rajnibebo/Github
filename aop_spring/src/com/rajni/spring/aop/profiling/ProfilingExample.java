/**
 * 
 */
package com.rajni.spring.aop.profiling;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author rajni.ubhi
 *
 */
public class ProfilingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkBean bean = getWorkBean();
		bean.doSomeWork(100000);
	}
	
	private static WorkBean getWorkBean() {
		WorkBean target = new WorkBean();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		
		ProfilingInterceptor interceptor = new ProfilingInterceptor();
		pf.addAdvice(interceptor);
		
		WorkBean proxy = (WorkBean) pf.getProxy();
		return proxy;
	}

}
