package com.steven.beans.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans-annotation.xml");
		TestObject testObject = (TestObject) applicationContext.getBean("testObject");
		System.out.println(testObject);
	
		
		UserController userController=(UserController)applicationContext.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		
//		UserRepository userRepository=(UserRepositoryImpl)applicationContext.getBean("userRepository");
//		System.out.println(userRepository);
//		
//		UserService userService=(UserService)applicationContext.getBean("userService");
//		System.out.println(userService);
	}
}
