package com.hugo83.sbgradleorm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.hugo83.sbgradleorm.Model.Member;

// @Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}