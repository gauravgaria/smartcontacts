package com.intellibyte.smartcontacts.users.ui.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellibyte.smartcontacts.users.ui.model.UserModel;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private Logger _logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment env;
	
	@GetMapping("/status")
	public String status() {
		
		return "Working on port " + env.getProperty("local.server.port");
	}
	
	@PostMapping(value="/register", consumes="application/json", produces="application/json")
	public UserModel registerUser(@Valid @RequestBody UserModel user) {
		_logger.info(user.getEmail());
		
		return user;
	}
}
