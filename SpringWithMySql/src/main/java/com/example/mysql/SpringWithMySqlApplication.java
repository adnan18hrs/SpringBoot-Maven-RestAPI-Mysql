package com.example.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithMySqlApplication {
	public static void main(String[] args) {
		System.out.println("Hello-1");
		SpringApplication.run(SpringWithMySqlApplication.class, args);
		System.out.println("Hello-2");
		//Book book = new Book();
		//book.info();
	}
}
