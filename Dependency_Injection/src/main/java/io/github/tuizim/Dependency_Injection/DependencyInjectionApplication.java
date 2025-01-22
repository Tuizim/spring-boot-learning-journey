package io.github.tuizim.Dependency_Injection;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(DependencyInjectionApplication.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("Prod");
		builder.run();
	}

}
