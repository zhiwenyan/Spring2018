package com.steven.bean.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**

 * @author yanzhiwen
 *
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car = (Car) applicationContext.getBean("car1");
		System.out.println(car);
	
		Car car2= (Car) applicationContext.getBean("car2");
		System.out.println(car2);
		
		
	}

}
