package com.hugo83.sblog04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class Sblog04Application {
	public static void main(String[] args) {
		SpringApplication.run(Sblog04Application.class, args);
	}
}
