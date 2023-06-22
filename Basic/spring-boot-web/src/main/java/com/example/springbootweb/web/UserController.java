package com.example.springbootweb.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootweb.model.User;
import com.example.springbootweb.repository.UserRepository;

@RestController
public class UserController {
    
    @Autowired
	private UserRepository userRepository;

    @RequestMapping("/add")
    public User saveUser() {
        User user=new User();
        user.setUserName("hugo");
        user.setEmail("personar95@naver.com");
        user.setNickName("Hugo");
        user.setPassWord("12345");
        // 현재 날짜 구하기
	    LocalDate now = LocalDate.now();
        user.setRegTime(now.toString());
        userRepository.save(user);
        return user;
    }
}
