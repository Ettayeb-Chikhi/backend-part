package com.ettayebchikhi.backendpart;

import com.ettayebchikhi.backendpart.models.AppUser;
import com.ettayebchikhi.backendpart.repository.UserRepository;
import com.ettayebchikhi.backendpart.utils.CsvDataAccess;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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

	@Bean
	CommandLineRunner initDb(UserRepository userRepository, CsvDataAccess csvDataAccess){
		return args->{
			List<AppUser> users = csvDataAccess.getRecords();
			users.forEach(user->{
				user.setId(null);
				userRepository.save(user);
			});
		};
	}

}
