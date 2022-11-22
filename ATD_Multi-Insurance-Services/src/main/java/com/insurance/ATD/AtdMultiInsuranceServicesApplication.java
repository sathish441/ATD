package com.insurance.ATD;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class AtdMultiInsuranceServicesApplication extends SpringBootServletInitializer {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AtdMultiInsuranceServicesApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AtdMultiInsuranceServicesApplication.class, args);
		
	}

}
