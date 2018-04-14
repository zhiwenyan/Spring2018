package com.steven.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 1.创建Spring的IOC容器对象
		// ApplicationContext 代表IOC容器，ClassPathXmlApplicationContext是ApplicationContext实现类  
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.从IOC容器中获取bean的对象
		//利用id定位到IOC容器中的bean
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
		// 3.调用Hello方法
		helloWorld.hello();
		
		
		Car car=(Car)applicationContext.getBean("car");
		System.out.println(car.toString());
		
		Car car2=(Car)applicationContext.getBean("car2");
		System.out.println(car2.toString());
		
		Person person=(Person)applicationContext.getBean("person");
		System.out.println(person.toString());
		
		Person person2=(Person)applicationContext.getBean("person2");
		System.out.println(person2.toString());

	}

}
