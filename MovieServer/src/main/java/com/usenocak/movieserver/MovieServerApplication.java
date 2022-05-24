package com.usenocak.movieserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MovieServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieServerApplication.class, args);
    }

}
