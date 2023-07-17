package com.example.springbootjpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.springbootjpa.model.UserDetail;
import com.example.springbootjpa.param.UserDetailParam;
import com.example.springbootjpa.repository.UserDetailRepository;
import com.mysql.cj.util.StringUtils;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements  UserDetailService{

    @Resource
    private UserDetailRepository userDetailRepository;

    @Override
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable){

        return userDetailRepository.findAll((root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            //equal 예제
            if (!StringUtils.isNullOrEmpty(detailParam.getIntroduction())){
                predicates.add(cb.equal(root.get("introduction"),detailParam.getIntroduction()));
            }
            //like 예제
            if (!StringUtils.isNullOrEmpty(detailParam.getRealName())){
                predicates.add(cb.like(root.get("realName"),"%"+detailParam.getRealName()+"%"));
            }
            //between 예제
            if (detailParam.getMinAge()!=null && detailParam.getMaxAge()!=null) {
                Predicate agePredicate = cb.between(root.get("age"), detailParam.getMinAge(), detailParam.getMaxAge());
                predicates.add(agePredicate);
            }
            //greaterThan 예제
            if (detailParam.getMinAge()!=null){
                predicates.add(cb.greaterThan(root.get("age"),detailParam.getMinAge()));
            }
            return query.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
        }, pageable);
    }
}