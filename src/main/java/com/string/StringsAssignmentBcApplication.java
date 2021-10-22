package com.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsAssignmentBcApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsAssignmentBcApplication.class, args);
	}
	
    // 1. Annotation
	
    @RequestMapping("/")
    // 3. Method that maps to the request route above
    public String page1() { // 3
            return "Hello Client have a awesome day!!";
    }
    @RequestMapping("/random")
    // 3. Method that maps to the request route above
    public String page2() { // 3
            return "Spring Tool is awesome feel free to use it!";
    }
}


