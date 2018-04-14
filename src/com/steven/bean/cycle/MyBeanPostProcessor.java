package com.steven.bean.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * arg0-->bean的实例  
	 * arg1-->bean的属性名称  
	 * 
	 * 
	 */
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessAfterInitialization-->"+arg0+"-->"+arg1);
		//这里偷梁换柱下 
		Car car=new Car();
		car.setBrand("Ford");
		return car;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessBeforeInitialization-->"+arg0+"-->"+arg1);
		if(arg1.equals("car")) {
			
		}
		return arg0;
	}
		

}
