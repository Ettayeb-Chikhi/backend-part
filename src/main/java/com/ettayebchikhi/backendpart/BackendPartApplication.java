package com.ettayebchikhi.backendpart;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = " InDatacore assigment",
				version = "1.0.0",
				description = "this project is an interview assigment for InDatacore company",
				contact = @Contact(
						name = "chikhi ettayeb",
						email = "ettayeb.chikhi@ump.ac.ma"
				)
		)
)
public class BackendPartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendPartApplication.class, args);
	}

}
