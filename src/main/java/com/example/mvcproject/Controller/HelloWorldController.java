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
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name){

        return " Hello " +  name  +   "From BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){

        return  "Hello" + name + "From BridgeLabz";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFirstName()+" "+user.getLastName()+ "From BridgeLabz";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String  firstName,@RequestParam(value = "lastName") String lastName){
        return "Hello" + firstName+ " " + lastName + "From BridgeLabz";
    }

}
