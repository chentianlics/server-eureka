package com.cs.servereurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerEurekaServiceApplication.class, args);
    }

}
