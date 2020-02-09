package com.securitytest.authClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
	public String main() {
		return "这里是client主页";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "这里是admin页";
	}
	
	@GetMapping("/user")
	public String user() {
		return "这里是user页";
	}
	
	@GetMapping("/login/oauth2/code/authorizationserver")
	public String authorizationserver() {
		return "这里是authorizationserver页";
	}
}
