package com.example.nwhacks_2021;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });
        TextView header = (TextView) findViewById(R.id.textView6);
        TextView intro = (TextView) findViewById(R.id.textView7);

        header.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));
        intro.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.textfadein));
        }
}
