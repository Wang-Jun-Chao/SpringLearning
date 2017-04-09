package org.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.test.bookpub.StartupRunner;

@SpringBootApplication
public class BookPubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookPubApplication.class, args);
	}

	@Bean
	public StartupRunner schedulerRunner() {
		return new StartupRunner();
	}
}
