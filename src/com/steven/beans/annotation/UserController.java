package com.steven.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 表现层
 * @author zhiwenyan
 *
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public void execute() {
		System.out.println("UserController execute()");
		userService.add();
	}

}
