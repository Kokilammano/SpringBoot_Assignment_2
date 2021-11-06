package com.abc.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abc.model.Student;
import com.abc.repo.StudentRepository;

@Component
public class DataJpa2Operation implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Save operation");
		repo.save(new Student(1,"Abi","abi@gmail.com",987136114,"Coimbatore"));
		repo.save(new Student(2,"Bala","bala@gmail.com",887689765,"Chennai"));
		repo.save(new Student(3,"Chithra","chithra@gmail.com",875544333,"Salem"));
	
		System.out.println("Get All Student Details");
		repo.findAll().forEach((System.out::println));
		
		System.out.println("Get Single Student Details");
		Optional<Student> c=repo.findById(1);
		if(c.isPresent()) {
			System.out.println(c.get());
		}else {
			System.out.println("No Data Found");
		}
		
		System.out.println("Get All Student Details");
		repo.findAll().forEach((System.out::println));
		
		
	}
	
}
