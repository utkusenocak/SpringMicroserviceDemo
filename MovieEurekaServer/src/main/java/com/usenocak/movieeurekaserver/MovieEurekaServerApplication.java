package com.usenocak.movieeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MovieEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieEurekaServerApplication.class, args);
    }

}
