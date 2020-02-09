package com.css.reading.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.css.reading.domain.User;
import com.css.reading.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		//userRepo.deleteAll();
		User charles = new User(null, "charles", "charles@gmail.com");
		User soares = new User(null, "soares", "soares@gmail.com");
		//userRepo.saveAll(Arrays.asList(charles, soares));
	}

}
