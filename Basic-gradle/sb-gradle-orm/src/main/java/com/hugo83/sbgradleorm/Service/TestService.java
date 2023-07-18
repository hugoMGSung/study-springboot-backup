package com.hugo83.sbgradleorm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo83.sbgradleorm.Model.Member;
import com.hugo83.sbgradleorm.Repository.MemberRepository;

@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}