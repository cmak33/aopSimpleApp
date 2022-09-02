package com.example.aopsimpleapp.aspects;

import com.example.aopsimpleapp.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class StudentServiceAspect {
    @Pointcut("execution(* com.example.aopsimpleapp.services.StudentService.*(..))")
    public void allStudentServiceMethods(){}

    @Before("allStudentServiceMethods()")
    public void beforeAllStudentServiceMethods(JoinPoint joinPoint){
        log.info(joinPoint.toString()+" --- before");
    }

    @AfterThrowing("execution(* com.example.aopsimpleapp.services.StudentService.saveStudent(..)) && args(student,..)")
    public void afterThrowingSaveStudentMethod(Student student){
        log.error("could not save student: "+student.toString());
    }
}
