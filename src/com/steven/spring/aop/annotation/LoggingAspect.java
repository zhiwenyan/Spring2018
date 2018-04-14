package com.steven.spring.aop.annotation;

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
@Aspect
@Component
public class LoggingAspect {
	
	
	/**
	 * 定义一个方法, 用于声明切入点表达式. 一般地, 该方法中再不需要添入其他的代码. 
	 * 使用 @Pointcut 来声明切入点表达式. 
	 * 后面的其他通知直接使用方法名来引用当前的切入点表达式. 
	 */
	@Pointcut("execution(public int com.steven.spring.aop.AtithmeticCalculator.*(..))")
	public void declareJointPointExpression(){}
	
	
	
	//@Before 声明该方法是一个前置通知：在目标方法之前执行
	//在这个接口com.steven1.aop.AtithmeticCalculator 实现类执行方法之前执行一段代码
	@Before("declareJointPointExpression()")
	/**
	 * 
	 * @param joinPoint 连接点
	 */
	public void beforeMethod(JoinPoint joinPoint){
		//joinPoint.getArgs() 参数  
		//joinPoint.getSignature().getName() 方法名
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The " + joinPoint.getSignature().getName()+" Method begins"+args);
	}
	
	/**
	 * 
	 * @param joinPoint
	 */
	//@@After 声明该方法是一个后置通知：在目标方法之后执行（抛异常也会执行）
	@After("execution(public int com.steven.spring.aop.AtithmeticCalculator.*(..))")
	public void afterMethod(JoinPoint joinPoint){
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The " +joinPoint.getSignature().getName()+" Method end"+args);
	}
	
	/**
	 * 在方法正常执行代码的通知
	 * 可以访问到方法返回值
	 * @param joinPoint
	 */
	//@@AfterReturning 返回通知
	@AfterReturning(value="declareJointPointExpression()",
			returning="result")
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The " +joinPoint.getSignature().getName()+" Method AfterReturning"+args+"result="+result);
	}
	
	/**
	 *
	 * @param joinPoint
	 */
	//@@AfterThrowing 异常通知
	@AfterThrowing(value="execution(public int com.steven.spring.aop.AtithmeticCalculator.*(..))",
			throwing="e")
	public void afterThrowingMethod(JoinPoint joinPoint,Exception e){
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The " +joinPoint.getSignature().getName()+" Method AfterReturning"+args+"Throwable="+e.getMessage());
	} 
	/**
	 *
	 *环绕通知 需要携带ProceedingJoinPoint   
	 *环绕通知 类似以动态代理的全过程  ProceedingJoinPoint类型的参数可以决定目标的方法  
	 *且环绕通知必须有返回值 ，即目标方法的返回值
	 *
	 *
	 * @param joinPoint
	 */
	//@Around 环绕通知
//	@Around("execution(public int com.steven.spring.aop.AtithmeticCalculator.*(..))")
//	public Object arroundMethod(ProceedingJoinPoint joinPoint){
//		Object result=null;
//		List<Object> args=Arrays.asList(joinPoint.getArgs());
//		//前置通知
//		System.out.println("The " +joinPoint.getSignature().getName()+" Method arroundMethod"+args);
//		try {
//			//执行目标方法 
//			result=joinPoint.proceed();
//			//后置通知
//			System.out.println("The " +joinPoint.getSignature().getName()+" Method end"+args);
//		} catch (Throwable e) {
//			e.printStackTrace();
//			//异常通知
//			System.out.println("The " +joinPoint.getSignature().getName()+" Method Throwable"+args+"Throwable="+e.getMessage());
//		}
//		return result;
//	} 
}
