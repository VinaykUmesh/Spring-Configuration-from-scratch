package com.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class AnotherEmplServiceImpl implements EmpService {
	
	private String[] data = {
			"Send yesterday report",
			"Send Today Report",
			"Meet me tomorow"
	};
	
	private Random random = new Random();
	
	@Override
	public String getEmployeeTask() {
		
		int i = random.nextInt(data.length);
		
		return data[i];
	}

}
