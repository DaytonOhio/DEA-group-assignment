/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.workoutplanner.workoutplannerapp.Controller;

import com.workoutplanner.workoutplannerapp.model.Athlete;
import com.workoutplanner.workoutplannerapp.service.AthleteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ebrahimehsan
 */
@Controller
public class AppController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

     @GetMapping("/contact")
     public String contact() {
        return "contact";
     }
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
    @GetMapping("/team")
    public String team() {
        return "team";
    }

    @GetMapping("/coach")
    public String coach() {
        return "coach";
    }

    @GetMapping("/athlete")
    public String athlete() {
        return "athlete";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/athlete-max")
    public String athletemax() {
        return "athlete-max";
    }

    @GetMapping("/athlete-view-schedule")
    public String athleteViewSchedule() {
        return "/athlete-view-schedule";
    }
    private final AthleteService athleteService;

    public AppController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("registerRequest", new Athlete());
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginRequest", new Athlete());
        return "login";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Athlete athlete) {
        System.out.println("register request: " + athlete);
        Athlete registeredAthlete = athleteService.registerAthlete(athlete.getFirstName(), athlete.getLastName(), athlete.getUsername(), athlete.getPassword(), athlete.getEmail());
        return registeredAthlete == null ? "error_page" : "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Athlete athlete) {
        System.out.println("login request: " + athlete);
        Athlete authenticated = athleteService.authenticate(athlete.getUsername(), athlete.getPassword());
        if (authenticated != null) {
            return "athlete";

        } else {
            return "error_page";
        }

    }
}
