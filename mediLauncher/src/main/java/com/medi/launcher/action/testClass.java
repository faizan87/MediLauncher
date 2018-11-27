package com.medi.launcher.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testClass {

	@Autowired
	AutoWiredClass autoWiredClass;
	
	@RequestMapping("/topics")
	public List<SetterGetterClass> getData(){
		System.out.println("Get request activated");
		
		return autoWiredClass.getAllData();
	}
	
	
}
