package com.cg.flp.returnrefund;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.flp.returnrefund")
public class ReturnrefundApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReturnrefundApplication.class, args);
	}
}
