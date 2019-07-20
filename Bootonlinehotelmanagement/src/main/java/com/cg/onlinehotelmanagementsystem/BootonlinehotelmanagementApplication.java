package com.cg.onlinehotelmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.cg")
@SpringBootApplication
public class BootonlinehotelmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootonlinehotelmanagementApplication.class, args);
	}

}
