package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.practice.query" })
public class GraphQLApplicationWithSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(GraphQLApplicationWithSpringBoot.class, args);
	}
}
