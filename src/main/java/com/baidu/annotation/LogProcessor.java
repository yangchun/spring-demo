package com.baidu.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class LogProcessor {
    @Pointcut("@annotation(com.baidu.annotation.Log)")
    public void log(){}

    @Before("log()")
    public void beforeSleep(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method=signature.getMethod();
        Log log=method.getAnnotation(Log.class);
        System.out.println("注解拦截方式:"+log.logger());//5

    }

//    @AfterReturning("log()")
//    public void afterSleep(){
//        System.out.println("after log！");
//    }
//
//    @Around("log()")
//    public Object processTx(ProceedingJoinPoint jp) throws Throwable {
//        System.out.println("执行目标方法之前，模拟开始事物...");
//        // 执行目标方法，并保存目标方法执行后的回值
//        Object rvt = jp.proceed();
//        System.out.println("执行目标方法之后，模拟结束事物...");
//        return rvt + "新增的内容";
//    }
}
