package com.steven.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-autowire.xml");
		Person person=(Person)applicationContext.getBean("person");
		System.out.println(person.toString());
		Person person1=(Person)applicationContext.getBean("person1");
		System.out.println(person1.toString());
	}

}
