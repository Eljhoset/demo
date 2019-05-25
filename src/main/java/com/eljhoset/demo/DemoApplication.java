package com.eljhoset.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
}
@RestController
@RequestMapping("/api/hello")
class HelloController {
	@GetMapping("/{name}")
	public String hello(@PathVariable String name){		
		return String.format("Hello %s", name);
	}
	@GetMapping
	public String hello(){
		return "Hello";
	}
}