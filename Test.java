package com.abc.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abc.model.Product;

@Component
public class Test implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Product p1=new Product();
		p1.setId(1);
		p1.setName("Book");
		p1.setPrice(500);
		
		Product p2=new Product();
		p2.setId(2);
		p2.setName("Pen");
		p2.setPrice(80);
		
		Product p3=new Product();
		p3.setId(3);
		p3.setName("Note");
		p3.setPrice(50);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
	
}
