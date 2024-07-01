package com.zhiwu.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/1 22:26
 */
@Slf4j
@Component
@Aspect
public class MyAopService {

    @AfterReturning("execution(* com.zhiwu.service.StudentService.*(..))")
    public void myBefore(JoinPoint pointcut) {
        log.info("前置通知");
    }


    @Before("execution(* com.zhiwu.service.StudentService.*(..))")
    public void myAfterReturning(JoinPoint pointcut) {
        log.info("后置通知");
    }

    @After("execution(* com.zhiwu.service.StudentService.*(..))")
    public void myAfter(JoinPoint pointcut) {
        log.info("最终通知");
    }

    @AfterThrowing(value = "execution(* com.zhiwu.service.StudentService.*(..))", throwing = "e")
    public void myException(Exception e) {
        System.out.println("异常通知");
        log.error("exception happened", e);
    }

    @Around("execution(* com.zhiwu.service.StudentService.*(..))")
    public Object myAround(ProceedingJoinPoint joinPoint) {
        log.info("环绕通知开始" + joinPoint.getSignature().getName());
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            log.error("error accured");
        }
        log.info("环绕通知结束");
        return result;
    }
}
