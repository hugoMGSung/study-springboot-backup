package com.hugo83.sblog04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo83.sblog04.domain.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByUserId(Long userId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}