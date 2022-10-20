package com.techgene;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("started the app");
		SpringApplication.run(DemoApplication.class, args);
	}

}
