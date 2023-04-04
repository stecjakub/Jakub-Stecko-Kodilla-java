package com.kodilla.kodillagoodpatterns2.facade;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
public class OrderLoggingAspect {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Pointcut("execution(* com.kodilla.kodillagoodpatterns2.facade.api.OrderFacade.processOrder(..))")
    public void processOrderExecution() {}

    @After("processOrderExecution()")
    public void logProcessOrder(JoinPoint joinPoint) {
        LocalDateTime timestamp = LocalDateTime.now();
        String formattedTimestamp = formatter.format(timestamp);

        System.out.println(formattedTimestamp + ": Order processing started for " + joinPoint.getSignature().getName() + " method.");
    }
}
