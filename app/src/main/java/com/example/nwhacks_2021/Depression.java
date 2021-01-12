package com.example.nwhacks_2021;

import java.util.ArrayList;

public class Depression {
    private ArrayList<String> symptoms;

    public Depression() {
        ArrayList<String> symptoms = new ArrayList<>();
        addSymptoms(symptoms);
        this.symptoms = symptoms;
    }

    public void addSymptoms(ArrayList<String> symptoms) {
        String[] sym = new String[] {"Feeling restless, wound-up, or on-edge", "Being easily fatigued",
                "Having difficulty concentrating; mind going blank", "Being irritable",
                "Feelings of guilt, worthlessness, and helplessness", "Pessimism and hopelessness",
                "Insomnia or sleeping too much", "Loss of interest in things once pleasurable",
                "Overeating, or appetite loss", "Aches, pains, headaches, or cramps that won't go away",
                "Digestive problems that don't get better, even with treatment", "Persistent sad, anxious, or empty feelings",
                "Suicidal thoughts or attempts"};
        for (String s: sym) {
            symptoms.add(s);
        }
    }

    public ArrayList<String> getList() {
        return symptoms;
    }
}

