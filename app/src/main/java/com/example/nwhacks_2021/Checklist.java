package com.example.nwhacks_2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Checklist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        String[] array = getResources().getStringArray(R.array.checklist);
        String item;
        Set<String> itemList = new HashSet<>();

        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        item = array[new Random().nextInt(array.length)];
        while (!itemList.add(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c1.setText(item);

        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        item = array[new Random().nextInt(array.length)];
        while (!itemList.add(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c2.setText(item);

        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        item = array[new Random().nextInt(array.length)];
        while (!itemList.add(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c3.setText(item);

        CheckBox c4 = (CheckBox) findViewById(R.id.checkBox4);
        item = array[new Random().nextInt(array.length)];
        while (!itemList.add(item)) {
            item = array[new Random().nextInt(array.length)];
        }
        c4.setText(item);

        Button nextPageBtn2 = (Button) findViewById(R.id.nextPageBtn2);
        nextPageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Checklist.this, EndPage.class);
                startActivity(i);
            }
        });
    }
}
