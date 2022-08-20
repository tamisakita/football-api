package com.fiap.footballapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class FootballApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballApiApplication.class, args);
	}

}
