package com.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@SpringBootApplication
public class HerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuApplication.class, args);
	}

	@GetMapping
	public String helloHeroku(){
		return "Hello From Heroku";
	}

}
