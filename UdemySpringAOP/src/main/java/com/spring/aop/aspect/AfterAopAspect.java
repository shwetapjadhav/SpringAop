package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(
			value = "com.spring.aop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		//logger.info(" Intercepted Method Call - {}", joinPoint);
		logger.info("{} returned with value {} ", joinPoint, result);
	}
	
	@AfterThrowing(
			value = "com.spring.aop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
			logger.info("{} returned with value {} ", joinPoint, exception);
	}
	
	@After(
			value = "com.spring.aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint) {
			logger.info("After execution of {} ", joinPoint);
	}
}
