package com.bms.bloodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BloodServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodServiceApplication.class, args);
	}

}
