package com.steven.aop.helloword;


public class AtithmeticCalculatorLoggingImpl implements AtithmeticCalculator {

	@Override
	public int add(int i, int j) {
		System.out.println("日志：The Method add begin with["+i+","+j+"]");
		int result=i+j;
		System.out.println("日志：The Method add end with");
		return result;
	}

	@Override
	public int sub(int i, int j) {
		System.out.println("日志：The Method sub begin with["+i+","+j+"]");
		int result=i-j;
		System.out.println("日志：The Method sub end with["+i+","+j+"]");
		return result;
	}

	@Override
	public int mul(int i, int j) {
		System.out.println("日志：The Method mul begin with["+i+","+j+"]");
		int result=i*j;
		System.out.println("日志：The Method mul end with["+i+","+j+"]");
		return result;
	}
	@Override
	public int div(int i, int j) {
		System.out.println("日志：The Method div begin with["+i+","+j+"]");
		int div=i/j;
		System.out.println("日志：The Method div end with["+i+","+j+"]");
		return div;
	}

}
