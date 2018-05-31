package com.baidu.aop.aop_01;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SleepHelper implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("sleep before advice");
    }
}
