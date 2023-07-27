package com.hugo83.sbgradleorm.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo83.sbgradleorm.Model.Member;
import com.hugo83.sbgradleorm.Repository.MemberRepository;

import java.util.List;
// import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> test() {
        memberRepository.save(new Member(2L, "Ashley Park"));

        // Optional<Member> member = memberRepository.findById(2L);
        List<Member> allMembers = memberRepository.findAll();
        //memberRepository.deleteById(2L);
        return allMembers;
    }
}
