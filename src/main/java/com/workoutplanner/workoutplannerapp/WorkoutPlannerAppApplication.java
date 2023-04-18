package com.workoutplanner.workoutplannerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class WorkoutPlannerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutPlannerAppApplication.class, args);
	}
        
}
