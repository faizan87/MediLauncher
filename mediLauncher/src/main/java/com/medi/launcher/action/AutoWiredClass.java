package com.medi.launcher.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AutoWiredClass {

	SetterGetterClass setterGetterClass;
	List<SetterGetterClass> getterClasses = new ArrayList<>();
	
	
	public List<SetterGetterClass> getAllData() {
		
		getterClasses.add(new SetterGetterClass("testing", "1"));
		
		System.out.println("executed "+getterClasses);
		
		return getterClasses;
	}
	
	
	
	
}
