package com.steven.aop.helloword;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

public class AtithmeticCalculatorLoggingProxy {
	// 要代理的对象
	private AtithmeticCalculator target;
	/**
	 * 
	 * @param target
	 */
	public AtithmeticCalculatorLoggingProxy(AtithmeticCalculator target) {
		this.target = target;
	}

	public AtithmeticCalculator getProxy() {

		/**
		 * 代理对象由哪一个类加载器完成 target.getClass().getClassLoader()
		 * 
		 * 
		 * target.getClass().getInterfaces()
		 * 
		 * 
		 * new InvocationHandler
		 * 
		 */
		return (AtithmeticCalculator) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), new InvocationHandler() {
			/** proxy 正在返回的那个代理对象
			 *  method 正在被调用的该方法
			 *  args  方法传入的参数
			 */
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//打印日志
						System.out.println("日志：The Method " + method.getName() + "begin with");
						Object result = method.invoke(target, args);
						System.out.println("日志：The Method " + method.getName() + "end with");
						return result;
					}
				});
	}
	
	
}
