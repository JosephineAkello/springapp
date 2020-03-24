package com.example.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    
    @RequestMapping("/authors")
    public String getAuthor(){
        return "authors";
    }
}
