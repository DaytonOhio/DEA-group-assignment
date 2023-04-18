/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.workoutplanner.workoutplannerapp.service;

import com.workoutplanner.workoutplannerapp.athlete.AthleteRepository;
import com.workoutplanner.workoutplannerapp.model.Athlete;
import org.springframework.stereotype.Service;

/**
 *
 * @author ebrahimehsan
 */
@Service
public class AthleteService {

    private final AthleteRepository athleteRepository;
    
    public AthleteService(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    public Athlete registerAthlete(String first_name, String last_name, String username, String password, String email) {
        if (username != null && password != null) {
            Athlete athlete = new Athlete();
            athlete.setUsername(username);
            athlete.setPassword(password);
            athlete.setEmail(email);
            athlete.setFirstName(first_name);
            athlete.setLastName(last_name);
            return athleteRepository.save(athlete);
        } else {
            return null;
        }
    }
    
    public Athlete authenticate(String username, String password){
        return athleteRepository.findByUsernameAndPassword(username, password).orElse(null);
    }
    
}
