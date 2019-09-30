package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsContext.xml");
		
		Office theOffice = context.getBean("employeeModel", Office.class);
		
		Office theAnotherOffice = context.getBean("employeeModel", Office.class);
		
		System.out.println(theOffice.getEmployeeName()+"\n"+theOffice.getEmployeeTask()+"\n"+theOffice.getTask());
		
		System.out.println((theOffice == theAnotherOffice) ? "Singleton" : "Prototype");
		
		context.close();
		
	}

}
