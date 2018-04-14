package com.steven.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 把这个类声明为一个人切面:需要把该类放入到IOC容器中、在声明为一个切面 
 * 
 * @author yanzhiwen
 *
 */
@Aspect
@Component
public class LoggingAspect {
	//@Before 声明该方法是一个前置通知：在目标方法之前执行
	@Before("execution(public int com.steven.aop.impl.AtithmeticCalculator.*(..))")
	/**
	 * 
	 * @param joinPoint 连接点
	 */
	public void beforeMethod(JoinPoint joinPoint){
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The" +joinPoint.getSignature().getName()+"Methid begins"+args);
	}
	
	/**
	 * 
	 * @param joinPoint
	 */
	//@@After 声明该方法是一个前置通知：在目标方法之后执行（抛异常也会执行）
	@After("execution(public int com.steven.aop.impl.AtithmeticCalculator.*(..))")
	public void afterMethod(JoinPoint joinPoint){
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The" +joinPoint.getSignature().getName()+"Methid end"+args);
	}

}
