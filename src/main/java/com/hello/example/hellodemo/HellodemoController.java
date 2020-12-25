package com.hello.example.hellodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellodemoController {
	//hiiiiiiiiiii
    @GetMapping("/hello")
    public String hello() {
        return "Welcome To Universe Anupam Again Through DFDFDF GHHHHHH";
    }

}
