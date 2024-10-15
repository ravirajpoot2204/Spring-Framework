package com.Spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.AOP.services.PaymentService;
import com.Spring.AOP.services.PaymentServiceImp;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/AOP/config.xml");
		PaymentService service = context.getBean("paymentImp", PaymentService.class);
		service.makePayment();
	}
}
