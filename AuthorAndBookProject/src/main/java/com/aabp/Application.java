package com.aabp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.aabp.service.impl",
//				"com.aabp.service",
//				"com.aabp.model",
//				"com.aabp.dao",
//				"com.aabp.controller",
//				"com.aabp.console",
//				"com.aabp.config"})
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}
}
