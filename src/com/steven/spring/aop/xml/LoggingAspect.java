package com.steven.spring.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 把这个类声明为一个人切面:需要把该类放入到IOC容器中、在声明为一个切面 
 * 
 * @author yanzhiwen
 *
 */
public class LoggingAspect {
	
	public void beforeMethod(JoinPoint joinPoint){
		//joinPoint.getArgs() 参数  
		//joinPoint.getSignature().getName() 方法名
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The " + joinPoint.getSignature().getName()+" Method begins"+args);
	}
	
	
	public void afterMethod(JoinPoint joinPoint){
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The " +joinPoint.getSignature().getName()+" Method end"+args);
	}
	
	
	
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The " +joinPoint.getSignature().getName()+" Method AfterReturning"+args+"result="+result);
	}
	

	public void afterThrowingMethod(JoinPoint joinPoint,Exception e){
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The " +joinPoint.getSignature().getName()+" Method AfterReturning"+args+"Throwable="+e.getMessage());
	} 

}
