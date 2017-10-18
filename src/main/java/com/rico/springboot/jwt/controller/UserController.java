package com.rico.springboot.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping
	public String index() {
		return "用户SSO模块";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST, RequestMethod.GET }, params = {})
	public String login() {
		return "用户登录";
	}
}
