package com.yang.spring_annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class myImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        /**
         * 将想加入容器的全类名返回即可
         */
        return new String[0];
    }
}
