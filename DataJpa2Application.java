//Spring Boot Application with Spring Data JPA

package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(DataJpa2Application.class, args);
		System.out.println("Spring started....");
	}

}
