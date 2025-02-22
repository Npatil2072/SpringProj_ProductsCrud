package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.nt.model") 
public class SpringRestProjProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestProjProductsApplication.class, args);
	}

}
