/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.workoutplanner.workoutplannerapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/login")
    public String login() {
        return "login";
    }

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
        return "athlete-view-schedule";
    }

}
