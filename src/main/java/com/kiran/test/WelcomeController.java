package com.kiran.test;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class WelcomeController {

	@GetMapping("/landing")
	public String index() {
		return "Logged in user: " + SecurityContextHolder.getContext().getAuthentication().getName();
	}
}
