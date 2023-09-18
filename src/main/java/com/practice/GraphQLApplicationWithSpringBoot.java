package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.practice.query", "com.practice.service" })
@EntityScan("com.practice.entity")
@EnableJpaRepositories("com.practice.repository")
public class GraphQLApplicationWithSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(GraphQLApplicationWithSpringBoot.class, args);
	}
}
