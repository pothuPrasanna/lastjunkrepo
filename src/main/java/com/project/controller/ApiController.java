package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ApiController {
	@GetMapping("/")
	public String home()
	{
		return "welcome to jenkins";
	}


}
