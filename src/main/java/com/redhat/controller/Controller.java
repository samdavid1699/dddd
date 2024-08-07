package com.redhat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
@GetMapping("/")
	public String getvalue() {
		return "Yipeee the code has beeen successfully deployed";
	}
@PostMapping("/{name}")
public String getvalue(@PathVariable String name) {
	return "Your name is " + name;
}
}
