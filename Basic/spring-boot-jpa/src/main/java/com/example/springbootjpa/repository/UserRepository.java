package com.example.springbootjpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootjpa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);

    @Transactional(timeout = 10)
    @Modifying
    @Query("UPDATE User SET userName = ?1 WHERE id = ?2")
    int modifyById(String  userName, Long id);

    @Transactional
    @Modifying
    @Query("DELETE FROM User WHERE id = ?1")
    void deleteById(Long id);

    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);

    @Query("SELECT u FROM User u")
    Page<User> findALL(Pageable pageable);

    Page<User> findByNickName(String nickName, Pageable pageable);

    Slice<User> findByNickNameAndEmail(String nickName, String email,Pageable pageable);
}
