package com.example.mvcproject.Controller;

import com.example.mvcproject.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")

public class HelloWorldController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from BridgeLabz";

    }

}
