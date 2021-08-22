package com.dockerTestSpring.yashSample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloWorldEndpoint {

	@PostMapping
	public String helloWorld() {
		return "Hello Svirtz here post mapping dev env";
	}
	@GetMapping
	public String helloWorld2() {
		return "Hello Svirtz here get mapping dev env";
	}
}

