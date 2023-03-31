package com.workoutplanner.workoutplannerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })@RestController

public class WorkoutPlannerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutPlannerAppApplication.class, args);
	}
        @GetMapping("/hello")
        public String hello(){
            return "Hello World!!!!";
        }

}
