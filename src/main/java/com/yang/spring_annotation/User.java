package com.yang.spring_annotation;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
/**
 public class User  implements InitializingBean, DisposableBean {
 **/
public class User{
    int id;
    String username;
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