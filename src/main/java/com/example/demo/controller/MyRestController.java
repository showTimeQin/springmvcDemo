package com.example.demo.controller;

import com.example.demo.service.DemoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Autowired
    DemoSerivce demoSerivce;

    @RequestMapping(value = "/testRest", produces = "text/plain; charset=UTF-8")
    public @ResponseBody String testRest(){
        return demoSerivce.sayHello();
    }
}
