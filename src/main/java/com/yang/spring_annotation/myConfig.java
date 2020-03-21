package com.yang.spring_annotation;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class myConfig implements BeanPostProcessor {
    @Bean
    public User user(){
        return  new User();
    }
}
