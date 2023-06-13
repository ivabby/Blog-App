package com.blogapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class BlogAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(BlogAppApplication.class, args);
		System.out.println("Blog App Started!!");
	}

}
