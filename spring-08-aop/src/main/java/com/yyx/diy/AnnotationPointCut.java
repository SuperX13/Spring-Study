package com.yyx.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//标注这个类是一个切面类
public class AnnotationPointCut {
    @Before("execution(* com.yyx.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=====方法执行前====");
    }
    @After("execution(* com.yyx.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("====方法执行后====");
    }
    //在环绕时我们给定一个参数，代表我们要获取的切入点
    @Around("execution(* com.yyx.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-环绕前-");
        proceedingJoinPoint.proceed();//执行方法
        System.out.println("-环绕后-");
    }
}
