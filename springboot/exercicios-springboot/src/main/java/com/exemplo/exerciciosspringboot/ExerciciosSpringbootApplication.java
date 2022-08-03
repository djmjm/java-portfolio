package com.exemplo.exerciciosspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosSpringbootApplication.class, args);
		System.out.println("Hello Tomcat!!!");
		System.out.println("Hello Spring!!!".toUpperCase());
	}

}
