package com.example.SmallWebApp1;
//package dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SmallWebApp1Application {

	public static void main(String[] args) {
		System.out.println("Hello-11");
		SpringApplication.run(SmallWebApp1Application.class, args);
		System.out.println("Hello-25");
	}
}
