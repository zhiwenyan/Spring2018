package com.steven.spring.aop.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop_xml.xml");

		AtithmeticCalculator atithmeticCalculatorImpl = (AtithmeticCalculator) classPathXmlApplicationContext
				.getBean("atithmeticCalculator");
		int result = atithmeticCalculatorImpl.add(1, 0);
		System.out.println(result);
		result = atithmeticCalculatorImpl.div(1, 1);
		System.out.println(result);

	}

}
