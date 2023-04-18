/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.workoutplanner.workoutplannerapp.Controller;

import com.workoutplanner.workoutplannerapp.model.Athlete;
import com.workoutplanner.workoutplannerapp.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * last updated: 4/3/23 This class is the Athlete controller class where it
 * controls the flow of the data for user athlete.
 *
 * @author ebrahimehsan
 */

public class AthleteController {

//    private final AthleteService athleteService;
//
//    public AthleteController(AthleteService athleteService) {
//        this.athleteService = athleteService;
//    }
//
//    
//
//    @GetMapping("/contact")
//    public String getRegisterPage(Model model) {
//        model.addAttribute("registerRequest", new Athlete());
//        return "contact";
//    }
//
//    @GetMapping("/login")
//    public String getLoginPage(Model model) {
//        model.addAttribute("loginRequest", new Athlete());
//        return "login";
//    }
//
//    @PostMapping("/contact")
//    public String register(@ModelAttribute Athlete athlete) {
//        System.out.println("register request: " + athlete);
//        Athlete registeredAthlete = athleteService.registerAthlete(athlete.getFirstName(), athlete.getLastName(), athlete.getUsername(), athlete.getPassword(), athlete.getEmail());
//        return registeredAthlete == null ? "contact" : "redirect:/login";
//    }

}
