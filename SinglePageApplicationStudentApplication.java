package com.singlepage.student.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class SinglePageApplicationStudentApplication {

	public static void main(String[] args) {
		System.out.println("Student application");
		SpringApplication.run(SinglePageApplicationStudentApplication.class, args);
	}

}
