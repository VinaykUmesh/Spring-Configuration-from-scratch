package com.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class EmpServiceImpl implements EmpService {
		
	@Override
	public String getEmployeeTask() {
		return "Send Report";
	}
	
	@PostConstruct
	public void beantInitMethod() {
		System.out.println(">> Bean Initialization");
	}
	
	@PreDestroy
	public void beanDestroyMethod() {
		System.out.println(">> Bean Destroyed");
	}
	
}
