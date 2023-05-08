package com.springBootSecurityLogin.springBootSecurityLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.springBootSecurityLogin.springBootSecurityLogin.repository")
@SpringBootApplication
public class SpringBootSecurityLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityLoginApplication.class, args);
	}

}
