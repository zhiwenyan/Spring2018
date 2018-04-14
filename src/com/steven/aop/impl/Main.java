package com.steven.aop.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop_impl.xml");

		AtithmeticCalculator atithmeticCalculatorImpl = (AtithmeticCalculator) classPathXmlApplicationContext
				.getBean(AtithmeticCalculator.class);

		int result = atithmeticCalculatorImpl.add(1, 1);
		System.out.println(result);

		result = atithmeticCalculatorImpl.div(8, 1);
		System.out.println(result);
		
		result = atithmeticCalculatorImpl.div(12, 0);
		System.out.println(result);
	}

}
