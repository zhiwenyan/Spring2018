package com.steven.jdbi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.stringtemplate.ExternalizedSqlViaStringTemplate3;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.springframework.jdbc.core.RowMapper;

public interface UserDao {
	@SqlQuery("select username from user where id=:id")
	String findNameById(@Bind("id") int id);

	@SqlQuery("select * from user where id=:id")
	@Mapper(UserMapper.class)
	User findUserById(@Bind("id") int id);

	@SqlQuery("select username from user")
	List<String> listNames();

	@SqlQuery("select username from user where id=:?")
	String findNameById1(int id);
	
	
	public class UserMapper implements ResultSetMapper<User> {

		@Override
		public User map(int arg0, ResultSet arg1, StatementContext arg2) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
