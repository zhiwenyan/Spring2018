package com.steven.bean.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的生命周期
 * @author yanzhiwen
 *
 */
public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-cycle.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
		//关闭IOC容器  
	//	applicationContext.close();
		
	}

}
