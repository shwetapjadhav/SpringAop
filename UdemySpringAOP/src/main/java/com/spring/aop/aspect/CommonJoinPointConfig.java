package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.spring.aop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.spring.aop.business.*.*(..))")
	public void businessLayerExecution() {}
	
//	@Pointcut("@annotaion(com.spring.aop.aspect.TrackTime)")
//	public void trackTimeAnnotation() {}
}
