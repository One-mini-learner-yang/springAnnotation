package com.yang.spring_annotation;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
@Data
/**
 public class User  implements InitializingBean, DisposableBean {
 **/
public class User extends ApplicationEvent implements ApplicationContextAware, BeanNameAware {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext){
        System.out.println(applicationContext);
        getBean(applicationContext.getBean("teacher"));
    }
    private void getBean(Object  user){
        System.out.println("执行了");
        System.out.println(user);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
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