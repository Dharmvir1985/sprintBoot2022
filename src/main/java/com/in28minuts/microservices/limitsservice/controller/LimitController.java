package com.in28minuts.microservices.limitsservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minuts.microservices.configuration.Configuration;
import com.in28minuts.microservices.limitsservice.been.Limits;

@ComponentScan({"com.in28minuts.microservices.configuration", "com.in28minuts.microservices.limitsservice.controller"})
@RestController
public class LimitController {
	
	@Autowired
	private Configuration  configuration;
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		//return new Limits(1,1000);
		
	}

}
