package com.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MessageController {


    @GetMapping("/messages")
public String getMessage(){
    return "hello from controller";
}
}
