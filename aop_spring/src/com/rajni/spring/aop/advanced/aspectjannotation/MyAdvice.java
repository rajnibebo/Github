/**
 * 
 */
package com.rajni.spring.aop.advanced.aspectjannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author rajni.ubhi
 *
 */
@Component
@Aspect
public class MyAdvice {
	
	@Pointcut("execution(* com.rajni.spring.aop.advanced.aspectjannotation..foo*(int)) && args(x)")
	public void fooExecution(int x) {
		System.out.println("fooExecution");
	}
	
	@Pointcut("bean(myDependency*)")
	public void inMyDependency() {
		System.out.println("inMydependency");
	}
	
	@Before("fooExecution(x) && inMyDependency()")
	public void simpleBeforeAdvice(JoinPoint joinPoint , int x) {
		if(x != 100) {
			System.out.println("Executing :"+joinPoint.getSignature().getDeclaringTypeName()+" "+
					joinPoint.getSignature().getName()+" : argument:"+x);
		}
	}
	
	@Around("fooExecution(x) && inMyDependency()")
	public Object simpleAroundAdvice(ProceedingJoinPoint pjp , int x) throws Throwable {
		System.out.println("Before Executing :"+pjp.getSignature().getDeclaringTypeName()+" "+
				pjp.getSignature().getName()+" : argument:"+x);
		
		Object retVal = pjp.proceed();
		
		System.out.println("After Executing :"+pjp.getSignature().getDeclaringTypeName()+" "+
				pjp.getSignature().getName()+" : argument:"+x);
		return retVal;
	}
}
