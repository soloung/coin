package com.chentiming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chentiming.daoImp.UserDaoImp;
import com.chentiming.entity.User;

@RestController
@RequestMapping(path = "/login")
public class LoginController {
	
	@Autowired
	private UserDaoImp userDaoImp;
	
	@RequestMapping(path = "/loginIn")
	public void login(){
		User user = null;
		System.out.println("coin-web login in");
		System.out.println(userDaoImp.getById(1).getName());
	}
	
}
