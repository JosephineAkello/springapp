package com.example.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    @RequestMapping("/publishers")
    public String getPublisher(){

        
        return "publishers";
    }


}
