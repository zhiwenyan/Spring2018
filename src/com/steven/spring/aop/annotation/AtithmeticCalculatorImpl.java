package com.steven.spring.aop.annotation;

import org.springframework.stereotype.Component;

@Component("atithmeticCalculator")
public class AtithmeticCalculatorImpl implements AtithmeticCalculator {

	@Override
	public int add(int i, int j) {
		int result=i+j;
		return result;
	}

	@Override
	public int sub(int i, int j) {
		int result=i-j;
		return result;
	}

	@Override
	public int mul(int i, int j) {
		int result=i*j;
		return result;
	}
	@Override
	public int div(int i, int j) {
		int div=i/j;
		return div;
	}

}
