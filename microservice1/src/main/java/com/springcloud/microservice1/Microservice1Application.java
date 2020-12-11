package com.springcloud.microservice1;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Microservice1Application {

    @Autowired
    private EurekaClient discoveryClient;

    public static void main(String[] args) {
        SpringApplication.run(Microservice1Application.class, args);
    }

}
