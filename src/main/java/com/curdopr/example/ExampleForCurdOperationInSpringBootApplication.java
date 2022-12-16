package com.curdopr.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.curdopr.repository"})
@EntityScan(basePackages = {"com.curdopr.data"})
@ComponentScan(basePackages = {"com.curdopr.*"})
public class ExampleForCurdOperationInSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleForCurdOperationInSpringBootApplication.class, args);
	}

}
