package com.yang.spring_annotation;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Teacher {
    int id;
    String name;
}
