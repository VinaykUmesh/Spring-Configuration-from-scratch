package com.spring.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random; 

public class HappyFortuneService implements FortuneService {
			
	@Override
	public String getFortune() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Hello get Practice on bowling");
		list.add("Hello get Practice on Fielding");
		list.add("Hello get Practice on catching balls");
		list.add("Hello get Practice on Running");
		
		Random rand = new Random();
		
		return list.get(rand.nextInt(list.size()));
	}
	
}
