package com.test.demo1.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorld {
	
	@Autowired
	Employee emp;
	
	Employee emp1 = new Employee();
	
	
	@GetMapping("/yogs")
	public String getOutput() {
		return "Hi Yogendraa and emp is "+emp;
	}
	
	@GetMapping("/yogs1")
	public String getOutput1() {
		return "Hi Yogendraa and emp is "+emp1;
	}

}
