package com.navigator.hacks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.navigator.hacks.model")
@EnableJpaRepositories("com.navigator.hacks.repository")
@SpringBootApplication
public class HacksApplication {

	public static void main(String[] args) {
		SpringApplication.run(HacksApplication.class, args);
	}

}
