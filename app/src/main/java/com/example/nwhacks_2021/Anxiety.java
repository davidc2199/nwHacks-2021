package com.example.nwhacks_2021;

import java.util.ArrayList;

public class Anxiety {

    private ArrayList<String> symptoms;

    public Anxiety() {
        ArrayList<String> symptoms = new ArrayList<>();
        addSymptoms(symptoms);
        this.symptoms = symptoms;
    }

    public void addSymptoms(ArrayList<String> symptoms) {
        String[] sym = new String[] {"Feeling restless, wound-up, or on-edge", "Being easily fatigued",
                                    "Having difficulty concentrating; mind going blank", "Being irritable",
                                    "Having muscle tension", "Difficulty controlling feelings of worry",
                                    "Insomnia or sleeping too much", "Feelings of danger, panic, or dread",
                                    "Increased or heavy sweating", "Obsessions about certain ideas, a sign of OCD"};
        for (String s: sym) {
            symptoms.add(s);
        }
    }

    public ArrayList<String> getList() {
        return symptoms;
    }
}
