package com.hugo83.sblog04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.hugo83.sblog04.service.UserDetailService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    private final UserDetailService userService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(authz -> authz
            .requestMatchers("/login", "/signup", "/user").permitAll()
            .anyRequest().authenticated());

        http.formLogin(login -> login
            .loginPage("/login")
            .defaultSuccessUrl("/articles", false));

        http.logout(logout -> logout
            .logoutSuccessUrl("/login")
            .invalidateHttpSession(true));

        http.cors(cors -> cors.disable())
            .csrf(csrf -> csrf.disable());

        return http.build();
    }

    // @Bean
    // public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, 
    //                                                    UserDetailService userDetailService) throws Exception {
    //     return http.getSharedObject(AuthenticationManagerBuilder.class)
    //             .userDetailsService(userService)
    //             .passwordEncoder(bCryptPasswordEncoder)
    //             .and()
    //             .build();
    // }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
