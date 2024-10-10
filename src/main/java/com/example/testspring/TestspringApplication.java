package com.example.testspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.example.repositories" }) // precisa ser o pacote onde estão os repositórios
@ComponentScan(basePackages = "com.example.controllers") // precisa ser o pacote onde estão os controllers
@EntityScan(basePackages = { "com.example.entities" }) // precisa ser o pacote onde estão as entidades
public class TestspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestspringApplication.class, args);
	}

}
