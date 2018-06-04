package edu.northeastern.cs5200.cs5200summer2018nagaraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Cs5200Summer2018NagarajApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Cs5200Summer2018NagarajApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources ( Cs5200Summer2018NagarajApplication.class);
	}

}
