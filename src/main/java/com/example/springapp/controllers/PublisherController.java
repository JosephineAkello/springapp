package com.example.springapp.controllers;

import com.example.springapp.Repository.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    private final PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }


    @RequestMapping("/publishers")
    public String getPublisher(Model model){

        model.addAttribute("publishers", publisherRepository.findAll());

        return "publishers";
    }


}
