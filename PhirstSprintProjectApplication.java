package com.example.phirstSprintProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhirstSprintProjectApplication implements CommandLineRunner {
	@Autowired
	HelloWorld hw;

	public static void main(String[] args) {
		SpringApplication.run(PhirstSprintProjectApplication.class, args);
	}

	public void run(String... args) throws Exception {
		hw.display();
	}

}
