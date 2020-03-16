package com.yang.spring_annotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class myImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        /**
         * AnnotationMetadata：当前类的注解信息
         * BeanDefinitionRegistry:BeanDefinition注册类；
         * 		把所有需要添加到容器中的bean；调用
         * 		BeanDefinitionRegistry.registerBeanDefinition手工注册进来
         * 	例：
             * 	// 指定Bean定义信息；（Bean的类型，Bean。。。）
             * 			RootBeanDefinition beanDefinition = new RootBeanDefinition(Yellow.class);
             * 			// 注册一个Bean，指定bean名
             * 			registry.registerBeanDefinition(Yellow.class.getName(), beanDefinition);
         */

    }
}
