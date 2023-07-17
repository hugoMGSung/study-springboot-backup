package com.hugo83.sbgradlestruct.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo83.sbgradlestruct.Model.Member;
import com.hugo83.sbgradlestruct.Repository.MemberRepository;

@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}