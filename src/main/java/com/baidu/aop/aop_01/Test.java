package com.baidu.aop.aop_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans_aop_01.xml");
        Sleepable sleeper = (Sleepable)appCtx.getBean("humanProxy");
        sleeper.sleep();
    }
}
