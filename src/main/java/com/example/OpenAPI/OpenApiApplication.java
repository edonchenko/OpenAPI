package com.example.OpenAPI;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "HelloWorld API", version = "1.0", description = "World Information"))
public class OpenApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenApiApplication.class, args);
	}
}
