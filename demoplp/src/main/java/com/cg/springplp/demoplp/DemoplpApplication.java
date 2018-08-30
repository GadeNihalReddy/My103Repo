package com.cg.springplp.demoplp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.springplp.demoplp")
public class DemoplpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoplpApplication.class, args);
	}
}
