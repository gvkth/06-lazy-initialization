package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements  Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice 30 minutes a day for baseball";
    }
}
