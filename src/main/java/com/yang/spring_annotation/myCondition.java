package com.yang.spring_annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class myCondition  implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        /**
         * @param conditionContext:判断条件能使用的上下文环境
         * @param annotatedTypeMetadata:注解所在位置的注释信息
         * */
        return false;
    }
}
