package com.steven.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {


	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public  User getUser(int id){
		String sql="select * from user where id=?";
		RowMapper<User> rowMaper=new BeanPropertyRowMapper<>(User.class);
		User user=jdbcTemplate.queryForObject(sql,rowMaper,id);
		return user;

	}
}
