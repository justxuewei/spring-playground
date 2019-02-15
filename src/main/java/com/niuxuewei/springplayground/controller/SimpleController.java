package com.niuxuewei.springplayground.controller;

import com.niuxuewei.springplayground.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SimpleController {

    @RequestMapping("/test")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/testjson")
    public User testjson() {
        return new User(11, "abc", "17615821400", new Date());
    }

}
