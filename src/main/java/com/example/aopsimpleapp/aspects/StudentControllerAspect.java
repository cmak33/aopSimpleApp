package com.example.aopsimpleapp.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class StudentControllerAspect {
    @Pointcut("execution(* com.example.aopsimpleapp.controllers.StudentController.*(..))")
    public void allStudentControllerMethods(){}

    @Before("allStudentControllerMethods()")
    public void beforeAllControllerMethods(JoinPoint jp){
        log.info(jp.toString()+" --- before");
    }

    @After("allStudentControllerMethods()")
    public void afterAllControllerMethods(JoinPoint jp){
        log.info(jp.toString()+" --- after");
    }
}
