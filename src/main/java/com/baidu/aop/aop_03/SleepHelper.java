package com.baidu.aop.aop_03;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
@Aspect
public class SleepHelper {

    @Pointcut("execution(* com.baidu.aop.aop_03.*.sleep(..))")
    public void sleeppoint(){}

    @Before("sleeppoint()")
    public void beforeSleep(){
        System.out.println("睡觉前要脱衣服!");
    }

    @AfterReturning("sleeppoint()")
    public void afterSleep(){
        System.out.println("睡醒了要穿衣服！");
    }
}
