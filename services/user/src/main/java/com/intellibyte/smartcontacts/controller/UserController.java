package com.intellibyte.smartcontacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.intellibyte.smartcontacts.dao.UserRepository;
import com.intellibyte.smartcontacts.entities.User;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("status")
	@ResponseBody
	public String status() {
		User user = new User();
		user.setFirstName("Gaurav");
		user.setLastName("Garia");
		userRepository.save(user);
		return "user service is running...";
	}
}
