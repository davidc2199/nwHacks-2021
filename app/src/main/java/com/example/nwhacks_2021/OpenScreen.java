package com.example.nwhacks_2021;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class OpenScreen extends AppCompatActivity {
    public ImageView openingimage;
    public static int openingEnd=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening_activity);

        openingimage = (ImageView) findViewById(R.id.openingimage);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(OpenScreen.this, IntroActivity.class);
                startActivity(i);
                finish();
            }
        }, openingEnd);
        Animation openinganimation = AnimationUtils.loadAnimation(this, R.anim.openinganimation);
        openingimage.startAnimation(openinganimation);
    }
}
