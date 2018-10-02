package com.example.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Pipeline2Application {

	public static void main(String[] args) {
		SpringApplication.run(Pipeline2Application.class, args);
	}

}

@RestController
class index {

	@RequestMapping(value = "index")
	public String index() {
		return "Hello World";
	}
}