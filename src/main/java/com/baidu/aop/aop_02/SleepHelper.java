package com.baidu.aop.aop_02;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SleepHelper implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("sleep before advice");
    }
}
