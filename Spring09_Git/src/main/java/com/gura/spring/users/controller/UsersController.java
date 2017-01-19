package com.gura.spring.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gura.spring.users.service.UsersService;
// component 스캔시 bean 이 되고 또 한 controller 역할을 할 수 있도록
@Controller
public class UsersController {
	// 의존객체 주입 되도록
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/users/signup_form")
	public String signupForm(){
		
		return "users/signup_form";
	}
}
