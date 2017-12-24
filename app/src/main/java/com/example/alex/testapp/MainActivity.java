package com.example.alex.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.alex.testapp.Controllers.Simulator;
import com.example.alex.testapp.Models.Poule;
import com.example.alex.testapp.Models.Team;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Simulator simulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setup(View view) {
        List<Team> teams = Arrays.asList(new Team("Barcelona"), new Team("Madrid"));
        Poule poule = new Poule(teams);
        simulator = new Simulator();
    }

    public void simulate(View view){
        simulator.simulate();
        int homeGoals = simulator.getMatch().getHomeGoals();
        Toast.makeText(this, "Home goals: " + homeGoals,
                Toast.LENGTH_SHORT).show();
    }
}
