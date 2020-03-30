package com.yang.spring_annotation;

import lombok.Data;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
@Profile("test")
@Data
public class Teacher {
    int id;
    String name;
    @PostConstruct
    public void init()
    {
        System.out.println("测试中---------");;
    }
}
