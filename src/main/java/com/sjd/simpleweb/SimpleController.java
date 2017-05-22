package com.sjd.simpleweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class SimpleController
{
    @RequestMapping("/sayHello") 
    String sayHello ()
    {
        return "Hello World";
    }
}