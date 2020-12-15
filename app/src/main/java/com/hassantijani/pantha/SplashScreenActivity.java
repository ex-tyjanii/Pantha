package com.hassantijani.pantha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.hassantijani.pantha.onboarding.OnboardingActivity;

public class SplashScreenActivity extends AppCompatActivity {

    Animation panthaAnim;
    ImageView panthaLogo;
    private static int SPLASH_SCREEN = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);

        panthaAnim = AnimationUtils.loadAnimation(this,R.anim.splash_animation);
        panthaLogo= findViewById(R.id.pantha_logo);


        panthaLogo.setAnimation(panthaAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, OnboardingActivity.class);
                startActivity(intent);
            }
        },SPLASH_SCREEN);
    }
}