package com.workoutplanner.workoutplannerapp.service;

import com.workoutplanner.workoutplannerapp.coach.CoachRepository;
import com.workoutplanner.workoutplannerapp.model.Coach;
import org.springframework.stereotype.Service;

/**
 *
 * @author albertlusk
 */
@Service
public class CoachService {

    private final CoachRepository coachRepository;

    public CoachService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }
    // Method for registration for coach
    public Coach registerCoach(String first_name, String last_name, String username, String password, String email) {
        if (username != null && password != null) {
            Coach coach = new Coach();
            coach.setUsername(username);
            coach.setPassword(password);
            coach.setEmail(email);
            coach.setFirst_name(first_name);
            coach.setLast_name(last_name);
            return coachRepository.save(coach);
        } else {
            return null;
        }
    }

    // Authentication method for login
    public Coach authenticate(String username, String password){
        return coachRepository.findByUsernameAndPassword(username, password).orElse(null);
    }

}
