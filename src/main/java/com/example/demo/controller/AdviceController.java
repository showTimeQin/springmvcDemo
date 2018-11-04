package com.example.demo.controller;

import com.example.demo.model.DemoObj;
import org.springframework.web.bind.annotation.ModelAttribute;

public class AdviceController {
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj){
        throw new IllegalArgumentException("非常抱歉，参数有误/" + "来自@ModelAttribute：" + msg);
    }
}
