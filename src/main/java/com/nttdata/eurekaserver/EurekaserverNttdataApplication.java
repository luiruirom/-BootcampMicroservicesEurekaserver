package com.nttdata.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverNttdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverNttdataApplication.class, args);
	}

}
