package org.springframework.samples.petclinic.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect{
	@Before("execution(* org.springframework.samples.petclinic.owner..*(..))")
	public void logBefore() {
		System.out.println("Before:: Logging before method");

	}
}
