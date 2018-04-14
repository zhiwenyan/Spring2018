package com.steven.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务层
 * @author zhiwenyan
 *
 */

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public void add() {
		System.out.println("userService add");
		userRepository.save();
	}
}
