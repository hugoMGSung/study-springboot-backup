package com.example.springbootweb.web;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootweb.model.User;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {
		return "Hello World";
	}

    @RequestMapping("/getUser")
    public User getUser() {
		User user=new User();
		user.setUserName("hugo");
		user.setPassWord("12345");
		return user;
	}
}
