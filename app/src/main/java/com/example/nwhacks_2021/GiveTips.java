package com.example.nwhacks_2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GiveTips extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Set<String> list;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        boolean outcome = getIntent().getBooleanExtra("outcome", true);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        if (outcome) {
            // Depression
            String[] array = getResources().getStringArray(R.array.tips_depression);
            String randomStr;
            list = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                randomStr = array[new Random().nextInt(array.length)];
                while(!list.add(randomStr)) {
                    randomStr = array[new Random().nextInt(array.length)];
                }
            }
        } else {
            // Anxiety
            String[] array = getResources().getStringArray(R.array.tips_anxiety);
            String randomStr;
            list = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                randomStr = array[new Random().nextInt(array.length)];
                while(!list.add(randomStr)) {
                    randomStr = array[new Random().nextInt(array.length)];
                }
            }
        }
        adapter = new RecyclerAdapter(new ArrayList<>(list));
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(adapter);
        recyclerView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));

        TextView header = (TextView) findViewById(R.id.textView);
        header.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));

        Button nextPageBtn1 = (Button) findViewById(R.id.nextPageBtn1);
        nextPageBtn1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));
        //button implementation from tips to todo
        nextPageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If outcome is true, display Depression tips, else display Anxiety tips
                Intent i = new Intent(GiveTips.this, Checklist.class);
                startActivity(i);
            }
        });


    }

}