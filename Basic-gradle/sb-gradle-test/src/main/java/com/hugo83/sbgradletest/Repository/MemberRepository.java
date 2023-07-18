package com.hugo83.sbgradletest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hugo83.sbgradletest.Model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}