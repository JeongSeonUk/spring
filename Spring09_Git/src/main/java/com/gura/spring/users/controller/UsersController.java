package com.gura.spring.users.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gura.spring.users.service.UsersService;
// component 스캔시 bean 이 되고 또 한 controller 역할을 할 수 있도록
@Controller
public class UsersController {
	// 의존객체 주입 되도록
	@Autowired
	private UsersService usersService;
	
	// ajax "/users/checkid.do" 요청 처리
	@RequestMapping("/users/checkid")
	@ResponseBody
	public Map<String, Object> checkid(@RequestParam String inputId){
		Map<String, Object> map = usersService.canUseId(inputId);
		return null;
	}
	
	@RequestMapping("/users/signup_form")
	public String signupForm(){
		
		return "users/signup_form";
	}
}
