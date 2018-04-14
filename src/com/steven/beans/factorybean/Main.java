package com.steven.beans.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);

	}

}
