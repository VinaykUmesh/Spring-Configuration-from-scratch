package com.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotations.Office;

public class JavaCOnfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		Office theOffice = context.getBean("employeeModel", Office.class);
		
		Office theAnotherOffice = context.getBean("employeeModel", Office.class);
		
		System.out.println(theOffice.getEmployeeName()+"\n"+theOffice.getEmployeeTask()+"\n"+theOffice.getTask());
		
		System.out.println((theOffice == theAnotherOffice) ? "Singleton" : "Prototype");
		
		context.close();
		
	}

}
