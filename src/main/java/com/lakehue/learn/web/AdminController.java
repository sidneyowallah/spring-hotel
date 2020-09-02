package com.lakehue.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping
    public String getLoginPage(){
        return "login";
    }
}
