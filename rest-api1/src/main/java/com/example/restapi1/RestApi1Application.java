package com.example.restapi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.restapi1.controller"})
@EntityScan("com.example.restapi1.entity")
@EnableJpaRepositories("com.example.restapi1.repository")
public class RestApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApi1Application.class, args);
	}

}
