package com.steven.jdbi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;

import javax.sql.DataSource;

import org.jdbi.v3.core.Jdbi;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * bean的作用域
 * 
 * @author yanzhiwen
 *
 */
public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		System.out.println(dataSource.toString());

		testJDBI(dataSource);
		testJDBI1(dataSource);
	}

	private static void testJDBI(DataSource dataSource) {
		DBI dbi = new DBI(dataSource);
		Handle handle = dbi.open();
		UserDao userDao = handle.attach(UserDao.class);
		String name = userDao.findNameById(1);
		System.out.println("username=" + name);
		System.out.println("-----------");

		User uesr = userDao.findUserById(1);
		System.out.println(uesr);
		System.out.println("------");
		System.out.println(userDao.listNames());
		System.out.println("************************");
		
		String username = handle.createQuery("select username from user where id = :id").bind("id", 3)
				.mapTo(String.class).first();
		System.out.println(username);
		System.out.println("-----------");	
	}
	
	private static void testJDBI1(DataSource dataSource) {
		Jdbi jdbi=Jdbi.create(dataSource);
		org.jdbi.v3.core.Handle handle=jdbi.open();
		String username = handle.createQuery("select username from user where id = :id").bind("id", 3)
				.mapTo(String.class).findOnly();
		System.out.println(username);
		System.out.println("-----------");	
	
	}

}
