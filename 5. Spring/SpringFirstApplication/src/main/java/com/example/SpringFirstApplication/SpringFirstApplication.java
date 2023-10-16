package com.example.SpringFirstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringFirstApplication.model.Message;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
	}

}

@RestController
class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
    
    @GetMapping("/hi")
    public String hi() {
    	return "Hi, I'm Định";
    }
    
    @GetMapping("/name")
    public String name() {
    	return "Hello, name";
    }
    
    @GetMapping("/welcome")
    public Object welcome() {
    	return new Message();
    }
}
