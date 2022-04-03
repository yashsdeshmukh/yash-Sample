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
		return "Hello Jenkins here post mapss commit without tag";
	}
	@GetMapping
	public String helloWorld2() {
		return "Hello Jenkins here get mapss commit without tag";
	}
}

