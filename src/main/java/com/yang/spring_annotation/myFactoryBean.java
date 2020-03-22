package com.yang.spring_annotation;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContextAware;

public class myFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return null;
    }


    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
