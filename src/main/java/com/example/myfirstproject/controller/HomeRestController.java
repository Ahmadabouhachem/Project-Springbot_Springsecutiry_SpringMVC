package com.example.myfirstproject.controller;


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

    @GetMapping("")
    public String getHome() {
        return "/home/welcome";
    }
    @GetMapping("/time")
    public String time(Model theModel) {
        theModel.addAttribute("time", new java.util.Date());
        return "/home/time";
    }

    @GetMapping("/coachinfo")
    public String getInfoCoach(Model theModel) {
        String coachName=name;
        int coachOld=old;
        String coachNat= country;
        theModel.addAttribute("coachName",coachName);
        theModel.addAttribute("coachOld",coachOld);
        theModel.addAttribute("coachNat",coachNat);
        return "/home/coach";
    }

}