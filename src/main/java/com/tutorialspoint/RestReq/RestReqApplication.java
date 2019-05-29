package com.tutorialspoint.RestReq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class RestReqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestReqApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String hello(){
		 return "Hello World";
	 }
	

}
