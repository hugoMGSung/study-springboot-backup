package com.hugo83.sbgradleorm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugo83.sbgradleorm.Model.Member;
import com.hugo83.sbgradleorm.Service.MemberService;
import com.hugo83.sbgradleorm.Service.TestService;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    MemberService memberService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }

    @GetMapping("/testin")
    public List<Member> setMember() {
        return memberService.test();
    }
}