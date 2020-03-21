package com.yang.spring_annotation;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Scope("prototype")
@Component
@Data
/**
 public class User  implements InitializingBean, DisposableBean {
 **/
public class User{
    int id;
//    @Value("${user.username}")
    String username;
    private ApplicationContext applicationContext;
    @PostConstruct
    public void init(){
        /**
         * 初始化方法
         */
        System.out.println("11111");
    }
    @PreDestroy
    public void destroy(){
        /**
         * 销毁方法
         */
        System.out.println("22222");
    }


/**
 @Override
 public void afterPropertiesSet() throws Exception {
 System.out.println("11111");
 }


 @Override
 public void destroy() throws Exception {
 System.out.println("22222");
 }
 **/
}