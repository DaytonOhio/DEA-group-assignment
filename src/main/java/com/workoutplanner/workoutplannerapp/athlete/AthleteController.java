/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.workoutplanner.workoutplannerapp.athlete;

import com.workoutplanner.workoutplannerapp.models.Athlete;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * last updated: 4/3/23 This class is the Athlete controller class where it
 * controls the flow of the data for user athlete.
 *
 * @author ebrahimehsan
 */
public class AthleteController {

    @GetMapping("/view-schedule")
    public String viewSchedule(Model model) {

        // need to add code to capture data from database
        model.addAttribute("scheduleData");
        return "athlete-view-schedule";
    }

    @GetMapping("/athlete-max")
    public String calculateMaxLift(Model model, @RequestParam("maxLift") int maxLift, @RequestParam("numSets") int numSets) {

        Athlete athlete = AthleteService.getCurrentAthlete();
        if (athlete == null) {
            return "redirect:/athlete-max";
        }
        model.addAttribute("athlete", athlete);

        // Calculate weight for each set and reps for each set
        List<Integer> setWeights = new ArrayList<>();
        List<Integer> setReps = new ArrayList<>();
        double weight = maxLift;
        
        // Open/Close Principle, able to change reps and the method will update itself.
        int maxReps = 12;

        // Calculate weight and reps for each set
        for (int i = 1; i <= numSets; i++) {
            setWeights.add((int) Math.round(weight));
            setReps.add(maxReps);
            weight *= 0.85;
            maxReps = (int) Math.round((maxReps - 1) * 0.9);
        }

        model.addAttribute("setWeights", setWeights);
        model.addAttribute("setReps", setReps);

        return "athlete-max";
    }

}
