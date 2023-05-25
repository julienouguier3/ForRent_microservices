package com.carrent.ForRent.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //allows API consumption
public class RestTemplateConfig {
    @Bean //allow API consumption
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
