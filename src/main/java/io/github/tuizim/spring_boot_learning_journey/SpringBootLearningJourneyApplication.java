package io.github.tuizim.spring_boot_learning_journey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootLearningJourneyApplication {
	@GetMapping("/hello-world")
	public String HelloWorld(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningJourneyApplication.class, args);
	}

}
