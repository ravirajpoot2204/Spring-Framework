package com.Spring.AOP.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.Spring.AOP.services.PaymentServiceImp.makePayment())") /* if parameter then add this .. */
	public void before() {
		System.out.println("Payment Started");

		// creation of authentication page and begin the process of authenticate, if
		// authenticate then move forward
	}

	@After("execution(* com.Spring.AOP.services.PaymentServiceImp.makePayment()) *")
	public void after() {
		System.out.println("Payment Done ");

		// creation of authentication page and begin the process of authenticate, if
		// authenticate then move forward
	}

}
