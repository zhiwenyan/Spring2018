package com.steven.aop.helloword;

public class Main {
	public static void main(String[] args) {
//		AtithmeticCalculator atithmeticCalculator = new AtithmeticCalculatorImpl();
//		int result = atithmeticCalculator.add(1, 1);
//		System.out.println("-->"+result);
//		
//		result=atithmeticCalculator.sub(2, 1);
//		System.out.println("-->"+result);
//		
//		result=atithmeticCalculator.div(4, 2);
//		System.out.println("-->"+result);
//		
//		result=atithmeticCalculator.mul(2, 2);
//		System.out.println("-->"+result);
		
//		atithmeticCalculator=new AtithmeticCalculatorLoggingProxy(target)
		AtithmeticCalculator target=new AtithmeticCalculatorImpl();
		AtithmeticCalculatorLoggingProxy atithmeticCalculatorLoggingProxy=new AtithmeticCalculatorLoggingProxy(target);
		AtithmeticCalculator proxy= atithmeticCalculatorLoggingProxy.getProxy();
		int result=proxy.add(1, 1);
		System.out.println(result);
		
	}

}
