package com.example.alex.testapp.Models;

import java.util.Collection;

/**
 * Created by Alex on 24-Dec-17.
 */

public class Poule {
    private Collection<Team> teams;

    public Poule(Collection<Team> teams) {
        this.teams.addAll(teams);
    }
}
