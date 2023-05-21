package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice fast blowling for 15 minutes!!!";
    }
}