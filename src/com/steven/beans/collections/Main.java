package com.steven.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		Person person3=(Person)applicationContext.getBean("person3");
		System.out.println(person3.toString());
		NewPerson newPerson=(NewPerson)applicationContext.getBean("newPerson");
		System.out.println(newPerson.toString());
		
		
		Person person4=(Person)applicationContext.getBean("person4");
		System.out.println(person4.toString());

	}

}
