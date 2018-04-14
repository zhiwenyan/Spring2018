package com.steven.beans.annotation;

import org.springframework.stereotype.Repository;
/**
 * 持久化层
 * @author zhiwenyan
 *
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
	@Override
	public void save() {
		System.out.println("UserRepository save");
	}

}
