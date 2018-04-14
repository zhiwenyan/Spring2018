package com.steven.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.steven.beans.autowire.Address;
import com.steven.beans.autowire.Person;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("beans-relation.xml");
//		Address address=(Address)applicationContext.getBean("address");
//		System.out.println(address.toString());
//		
		Address address2=(Address)applicationContext.getBean("address2");
		System.out.println(address2.toString());
//		
		Address address3=(Address)applicationContext.getBean("address3");
		System.out.println(address3.toString());
		
		
		Person person=(Person)applicationContext.getBean("person");
		System.out.println(person.toString());

	}

}
