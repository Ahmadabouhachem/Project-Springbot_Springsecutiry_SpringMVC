package com.example.myfirstproject.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home") //it means the user must write localhost:8081/(servlet.context-path)/home
public class HomeRestController {

    @Value("${name}")
    private String name;

    @Value("${old}")
    private int old;

    @Value("${coach.nationality}")
    private String country;

    // expose "/" that return my Message!
    @GetMapping("")
    public String welcomeHome(Model theModel) {
        theModel.addAttribute("time", new java.util.Date());
        return "time";
    }

    @GetMapping("/coachinfo")
    public String getInfoCoach() {
        return "The Name ist: " + name + ", his Age is: " + old + ", his Nationality is: " + country;
    }
}