package com.app.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
		
		//@Pointcut("execution(void com.app.aspect.LoggingAspect.getMessage(..))")
		
		//@Pointcut("execution(* com.app.*.*.*(..))")
		//@Pointcut("execution(* com.app..*.*(..))")
		//@Pointcut("execution(* *.*.*.*(..))")
		//@Pointcut("execution(public * com.app..*.*())")
		//@Pointcut("execution(public * com..*.get*())")
		//@Pointcut("execution(* com..*.get*())")
		@Pointcut("execution(public void com..*.g*(..))")
		public void pointcut(){}
		
		@Before("pointcut()")
		public void getMessage() {
			System.out.println("This is Advice Method ");
			
		}
		 
		@After("pointcut()")
		public void showMsg() {
			System.out.println("This is After  Advice Match ");
		}

}
