//SpringBoot Project with Lombok integration

package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLombokApplication.class, args);
		System.out.println("Spring Boot Lombok......");
	}

}
