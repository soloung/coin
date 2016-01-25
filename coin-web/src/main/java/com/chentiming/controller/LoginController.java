package com.chentiming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chentm.dao.entity.User;

@RestController
@RequestMapping(path = "/login")
public class LoginController {
	
	@RequestMapping(path = "/loginIn")
	public void login(){
		User user = null;
		System.out.println("coin-web login in");
	}
	
}
