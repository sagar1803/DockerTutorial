package com.docker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	
	@GetMapping(path = "/docker/{name}")
	public String welcomeDocker(@PathVariable("name") String name) {
		return "<h3>Hello " + name + "</h3>";
	}

}
