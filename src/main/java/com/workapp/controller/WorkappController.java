package com.workapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/work")
public class WorkappController {
	@GetMapping(value="/workapp")
	public String getWork() {
		return "Hello";
	}

}
