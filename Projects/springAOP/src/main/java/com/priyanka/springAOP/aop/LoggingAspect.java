package com.priyanka.springAOP.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);

    //return type,className.methodName(args)
    @Before("execution(* com.priyanka.springAOP.service.JobService.*(..))")
    public void logMethodCall(){
        logger.info("Method Called");
    }

}
