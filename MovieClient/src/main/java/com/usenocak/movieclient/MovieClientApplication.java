package com.usenocak.movieclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MovieClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieClientApplication.class, args);
    }

}
