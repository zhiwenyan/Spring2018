package com.steven.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.steven.beans.autowire.Car;
/**
 * bean的作用域
 * @author yanzhiwen
 *
 */
public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car = (Car) applicationContext.getBean("car");
		Car car2 = (Car) applicationContext.getBean("car");
		System.out.println(car==car2);
	}

}
