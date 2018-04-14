package com.steven.spring.aop.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop_annotation.xml");

		AtithmeticCalculator atithmeticCalculatorImpl = (AtithmeticCalculator) classPathXmlApplicationContext
				.getBean("atithmeticCalculator");
		System.out.println();
		int result = atithmeticCalculatorImpl.add(1, 0);
		System.out.println(result);
		result = atithmeticCalculatorImpl.div(1, 1);
		System.out.println(result);

	}

}
