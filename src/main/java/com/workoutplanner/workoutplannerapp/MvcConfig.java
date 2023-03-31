/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.workoutplanner.workoutplannerapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author ebrahimehsan
 */
@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/index").setViewName("index");
    registry.addViewController("/login").setViewName("login");
    registry.addViewController("/contact").setViewName("contact");
    registry.addViewController("/team").setViewName("team");
    registry.addViewController("/coach").setViewName("coach");
    registry.addViewController("/class").setViewName("class");
    registry.addViewController("/athlete").setViewName("athlete");
    registry.addViewController("/athlete-view-schedule").setViewName("athlete-view-schedule");
    registry.addViewController("/athlete-max").setViewName("athlete-max");
    registry.addViewController("/admin").setViewName("admin");
    registry.addViewController("/about").setViewName("about");
  }

}
