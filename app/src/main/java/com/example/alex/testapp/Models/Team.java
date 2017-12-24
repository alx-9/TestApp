package com.example.alex.testapp.Models;

/**
 * Created by Alex on 18-Jul-17.
 */

public class Team {

    public String getName() {
        return name;
    }

    private String name;
    private long strength;

    public Team(String name) {
        this.name = name;
    }
}
