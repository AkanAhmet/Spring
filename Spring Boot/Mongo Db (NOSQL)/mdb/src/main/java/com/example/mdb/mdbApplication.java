package com.example.mdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class mdbApplication {
    public static void main(String[] args) {
        SpringApplication.run(mdbApplication.class,args);
    }

}
