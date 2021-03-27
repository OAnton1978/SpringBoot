package com.example.homeTaskSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class HomeTaskSpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(HomeTaskSpringbootApplication.class, args);
	}
}
