package com.example.springbootcommandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCommandlinerunnerApplication {

	public static void main(String[] args) {
		System.out.println("서비스 시작합니다.");
		SpringApplication.run(SpringBootCommandlinerunnerApplication.class, args);
		System.out.println("서비스 시작되었습니다.");
	}

}
