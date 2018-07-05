package com.hs.restapi;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hs.domain.User;
import com.hs.service.UserService;

@RestController
public class UserApi {
	
	private static final Logger logger = LoggerFactory.getLogger(UserApi.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/v1/users")
	public List<User> findAllUsers() {
		return userService.findAllUsers();
	}

}
