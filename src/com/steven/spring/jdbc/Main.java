package com.steven.spring.jdbc;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * bean的作用域
 * @author yanzhiwen
 *
 */
public class Main {
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
		DataSource dataSource=(DataSource)applicationContext.getBean("dataSource");
		System.out.println(dataSource.toString());
		
		JdbcTemplate jdbcTemplate=(JdbcTemplate)applicationContext.getBean("jdbcTemplate");
		/*String updateSql="UPDATE user SET username=? WHERE id=?";
		jdbcTemplate.update(updateSql, "stevenyan", 1);
		
		
		String selectSql="select * from user";
		jdbcTemplate.execute(selectSql);*/
		
//		//insert 
//		String insertSql="insert into user(username,email,password,id) values(?,?,?,?)";
//		List<Object[]> batchArgs=new ArrayList<>();
//		batchArgs.add(new Object[]{"stevenyan3","10595@qq.com","123",3});
//		batchArgs.add(new Object[]{"stevenyan4","10595@qq.com","123",4});
//		batchArgs.add(new Object[]{"stevenyan5","10595@qq.com","123",5});
//		jdbcTemplate.batchUpdate(insertSql, batchArgs);
		queryforObject(jdbcTemplate);
		queryforList(jdbcTemplate);
		
		
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		System.out.println(userDao.getUser(1));
		
		
		NamedParameterJdbcTemplate namedParameterJdbcTemplate=(NamedParameterJdbcTemplate)
				applicationContext.getBean("namedParameterJdbcTemplate");
	//	testNamedParameterJdbcTemplate(namedParameterJdbcTemplate);
		
		//testNamedParameterJdbcTemplate2(namedParameterJdbcTemplate);


	}
	
	/**
	 * 
	 * 
	 * 具名参数
	 * 
	 * 
	 * 
	 * @param namedParameterJdbcTemplate
	 */
	private static void testNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate){

		String sql="insert into user(username,email,password,id) values(:username,:email,:pw,:id)";
		
		Map<String, Object> paramMap=new HashMap<>();
		paramMap.put("username", "yanzhiwen");
		paramMap.put("email", "zhiwenyan@qq.com");
		paramMap.put("pw", "123456");
		paramMap.put("id", 6);
		namedParameterJdbcTemplate.update(sql, paramMap);
	}

	/**
	 * 使用具名参数时   可以使用update(String sql, SqlParameterSource paramSource)
	 * 
	 * 1、sql语句和参数命一致
	 * 
	 * @param namedParameterJdbcTemplate
	 */
	private static void testNamedParameterJdbcTemplate2(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
		
		String sql="insert into user(username,email,password,id) values(:username,:email,:password,:id)";
		User user=new User();
		user.setId(8);
		user.setEmail("zhiwenyan@gmail.com");
		user.setPassword("123456");
		user.setUsername("zhiwenyan");
		namedParameterJdbcTemplate.update(sql, new BeanPropertySqlParameterSource(user));
	}
	

	/**
	 * 从数据库取一条数据
	 * 注意不是掉调用这个方法 queryForObject(String sql, Class<T> requiredType, Object... args) 
	 * 需要调用这个方法  queryForObject(String sql, RowMapper<T> rowMapper, Object... args)
	 * 
	 * 其中RowMapper 指定如何去映射结果集的行，常用的实现类BeanPropertyRowMapper
	 * 不支持级联属性，JdbcTemplate到底是一个jdbc的小工具 而不是ORM框架
	 *
	 * @param jdbcTemplate
	 */
	public static void queryforObject(JdbcTemplate jdbcTemplate){
		String sql="select * from user where id=?";
		RowMapper<User> rowMaper=new BeanPropertyRowMapper<>(User.class);
		User user=jdbcTemplate.queryForObject(sql,rowMaper,1);
		System.out.println(user.toString());

	}

	private static void queryforList(JdbcTemplate jdbcTemplate) {
		String sql="select * from user where id>?";
		RowMapper<User> rowMaper=new BeanPropertyRowMapper<>(User.class);
		List<User> user=jdbcTemplate.query(sql,rowMaper,2);
		System.out.println(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
