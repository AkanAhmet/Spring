package com.akan.PostgreSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PostgreSqlApplication {  // localhost:8081 kullanıldı.

	public static void main(String[] args) {
		SpringApplication.run(PostgreSqlApplication.class, args);
	}

}
