package com.yang.spring_annotation;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
public class myScanFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        /**
            获取当前类的注解信息
         */
        AnnotationMetadata annotationMetadata =metadataReader.getAnnotationMetadata();
        /**
            获取当前类的路径
         */
        Resource resource= metadataReader.getResource();
        /**
            获取当前类的信息
         */
        ClassMetadata classMetadata= metadataReader.getClassMetadata();
        return true;
    }

}
