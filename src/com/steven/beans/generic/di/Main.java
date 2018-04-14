package com.steven.beans.generic.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-generic.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.add();
	}

}
