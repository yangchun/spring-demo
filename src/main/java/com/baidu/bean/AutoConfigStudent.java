package com.baidu.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class AutoConfigStudent {

    @Bean
    public Student stu1(){
        return new Student();
    }



}
