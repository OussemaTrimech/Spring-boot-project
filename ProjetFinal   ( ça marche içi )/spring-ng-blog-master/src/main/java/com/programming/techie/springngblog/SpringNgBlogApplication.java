package com.programming.techie.springngblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@SpringBootApplication
@EnableWebSocket
@EnableSwagger2

public class SpringNgBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNgBlogApplication.class, args);
	}

}