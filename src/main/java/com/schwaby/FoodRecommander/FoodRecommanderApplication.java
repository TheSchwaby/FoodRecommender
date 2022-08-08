package com.schwaby.FoodRecommander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class FoodRecommanderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodRecommanderApplication.class, args);
	}
}
