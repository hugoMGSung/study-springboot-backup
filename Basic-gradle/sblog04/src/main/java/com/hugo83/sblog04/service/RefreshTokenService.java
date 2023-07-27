package com.hugo83.sblog04.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.hugo83.sblog04.domain.RefreshToken;
import com.hugo83.sblog04.repository.RefreshTokenRepository;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}