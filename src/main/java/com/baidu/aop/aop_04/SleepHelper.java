package com.baidu.aop.aop_04;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SleepHelper {
    public void beforeSleep() {
        System.out.println("表演之前要整理衣服");
    }

    public void afterSleep() {
        System.out.println("表演之后要行礼");
    }
}
