package com.everisp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.everisp"})
public class ExamenEverisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenEverisApplication.class, args);
	}

}
