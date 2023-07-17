package com.example.springbootjpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.springbootjpa.model.UserDetail;
import com.example.springbootjpa.param.UserDetailParam;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
