package com.riteship.crs.api.gateway.microservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("riteship-crs-api-gateway-microservice")
@Configuration
public class CloudConfig {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
