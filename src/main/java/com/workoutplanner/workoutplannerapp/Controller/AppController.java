/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.workoutplanner.workoutplannerapp.Controller;

import com.workoutplanner.workoutplannerapp.model.Athlete;
import com.workoutplanner.workoutplannerapp.service.AthleteService;
import com.workoutplanner.workoutplannerapp.model.Coach;
import com.workoutplanner.workoutplannerapp.service.CoachService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.sql.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ebrahimehsan
 */
@Controller
public class AppController {
    Connection conn = null;
    Statement stmt = null;

    // Establish a connection to the workoutplanner database
    // conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workoutplanner", "root", "");

    // Create a statement object for executing SQL queries
    // stmt = conn.createStatement();


    // Mapping to html pages
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/create")
    public String create() { return "create"; }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

     @GetMapping("/contact")
     public String contact() {
        return "contact";
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
    private AthleteService athleteService;

    private CoachService coachService;
    public AppController(AthleteService athleteService, CoachService coachService) {
        this.athleteService = athleteService;
        this.coachService = coachService;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("registerRequest", new Athlete());
        return "index";
    }

    @GetMapping("/team")
    public String getTeamPage(Model model) {
        model.addAttribute("teamRequest", new Coach());
        return "team";
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

    @PostMapping("/create")
    public String create(@ModelAttribute Coach coach) {
        System.out.println("register request: " + coach);
        Coach registeredCoach = coachService.registerCoach(coach.getFirst_name(), coach.getLast_name(), coach.getUsername(), coach.getPassword(), coach.getEmail());
        return registeredCoach == null ? "error_page" : "redirect:/login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute Athlete athlete) {
        System.out.println("login request: " + athlete);
        Athlete authenticated = athleteService.authenticate(athlete.getUsername(), athlete.getPassword());
        Coach coach_authenticated = coachService.authenticate(athlete.getUsername(), athlete.getPassword());
        if (authenticated != null) {
            return "athlete";
        }
        if (coach_authenticated != null) {
            return "coach";
        } else {
            return "error_page";
        }
    }
    @PostMapping("/team")
    public String team(@ModelAttribute Coach coach) {
        System.out.println("team request: " + coach);
        return "team";
    }

//    @PostMapping("/admin")
//    public String admin(@ModelAttribute Coach coach) {
//
//    }
}
