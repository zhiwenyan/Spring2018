package com.steven.beans.properties;

import javax.sql.DataSource;

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

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-properties.xml");
		DataSource dataSource=(DataSource)applicationContext.getBean("dataSource");
		System.out.println(dataSource.toString());
		
	}

}
