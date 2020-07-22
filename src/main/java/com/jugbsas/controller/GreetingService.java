package com.jugbsas.controller;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class GreetingService {

	@ConfigProperty(name = "greetings.message", defaultValue = "no greeting")
	private String message;	
	
	public String getMessage() {
		return this.message;
	}
	
}
