package com.baidu.aop.aop_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans_aop_03.xml");
        Sleepable sleeper = (Sleepable)appCtx.getBean("human");
        sleeper.sleep();
    }
}
