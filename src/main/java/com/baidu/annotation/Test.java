package com.baidu.annotation;

import com.baidu.aop.aop_01.Sleepable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans_annotation.xml");
        Student student = (Student)appCtx.getBean("student");
        System.out.println(student.getName());
    }

}
