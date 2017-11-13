/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Jovana BGD
 */
public class InterceptorLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + method.getName());
        System.out.println("******");
    }

    @After("execution(*com.it355.jovanastricic.dao.impl.UslugaDaoImpl.addUsluga(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() metoda je pozvana!");
        System.out.println("presretanje : "
                + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    @AfterThrowing(
            pointcut = "execution(*com.it355.jovanastricic.dao.impl.UslugaDaoImpl.addUslugaThrowException())",
            throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("logAfterThrowing()  metoda je pozvana!");
        System.out.println("presretanje : "
                + joinPoint.getSignature().getName());
        System.out.println("Exception : " + error);
        System.out.println("******");
    }

    @Around("execution(* execution(*com.it355.jovanastricic.dao.impl.UslugaDaoImpl.addUslugaAround(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("logAround()  metoda je pozvana!");
        System.out.println("presretanje metode : "
                + joinPoint.getSignature().getName());
        System.out.println("presretanje : "
                + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Around before  metoda je pozvana!");
        joinPoint.proceed();
        System.out.println("Around  metoda je pozvana!");
        System.out.println("******");
    }
}
