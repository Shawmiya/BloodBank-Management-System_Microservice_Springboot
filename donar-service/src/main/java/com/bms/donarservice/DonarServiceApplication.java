package com.bms.donarservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DonarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonarServiceApplication.class, args);
	}

}
