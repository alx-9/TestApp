package com.example.alex.testapp.Models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex on 24-Dec-17.
 */

public class Match {

    private Team homeTeam, awayTeam;

    @Getter
    @Setter
    private int homeGoals, awayGoals = 0;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
}
