package com.yang.spring_annotation;

import org.springframework.beans.factory.FactoryBean;

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
