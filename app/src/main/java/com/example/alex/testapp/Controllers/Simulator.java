package com.example.alex.testapp.Controllers;

import com.example.alex.testapp.Models.Match;

import lombok.Getter;

/**
 * Created by Alex on 24-Dec-17.
 */

public class Simulator {

    @Getter
    private Match match;


    public void init(Match match) {
        this.match = match;
    }

    public void simulate() {
        match.setHomeGoals(1);
        match.setAwayGoals(0);
    }
}
