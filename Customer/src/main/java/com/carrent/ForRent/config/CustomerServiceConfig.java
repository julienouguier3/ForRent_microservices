package com.carrent.ForRent.config;

import com.carrent.ForRent.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
public class CustomerServiceConfig {
    @Bean
    public CustomerService customerService(){return new CustomerService();}
}
