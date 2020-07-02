package com.xu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@RestController
@ServletComponentScan
public class Application {
	@RequestMapping("/")
	public String SayHello(){
		return "hello";
	}
	 public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }
}
