package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class EmployeeModel implements Office {
	
	@Autowired
	@Qualifier("anotherEmplServiceImpl")
	private EmpService empService;
	
	@Value("${foo.task}")
	private String task;
	
	@Override
	public String getTask() {
		return task;
	}
	

	
//	@Autowired
//	public EmployeeModel(EmpService theEmpService) {
//		empService = theEmpService;
//	}
	
	@Override
	public String getEmployeeName() {
		return "Raja";
	}
//	
//	public void setEmpService(EmpService empService) {
//		this.empService = empService;
//	}

	@Override
	public String getEmployeeTask() {
		return empService.getEmployeeTask();
	}
	
	

}
