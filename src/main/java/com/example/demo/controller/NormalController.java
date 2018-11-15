package com.example.demo.controller;

import com.example.demo.service.DemoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalController {
    @Autowired
    DemoSerivce demoSerivce;

    @RequestMapping("/normal")
    public String testPage(Model model){
        model.addAttribute("msg", demoSerivce.sayHello());
        return "page";
    }


}
