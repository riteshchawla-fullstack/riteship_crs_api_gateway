package com.riteship.crs.api.gateway.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.riteship.campus.recruitment.systems.application",
		exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class RiteShipCrsAPIGatewayMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiteShipCrsAPIGatewayMicroServiceApplication.class, args);
	}

}
