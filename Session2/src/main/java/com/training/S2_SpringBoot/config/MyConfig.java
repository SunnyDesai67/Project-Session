package com.training.S2_SpringBoot.config;

import com.training.S2_SpringBoot.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Animal hello(){
        return new Animal();
    }
}
