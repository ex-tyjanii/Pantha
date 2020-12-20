package com.hassantijani.pantha.onboarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hassantijani.pantha.R;
import com.hassantijani.pantha.auth.LoginActivity;
import com.hassantijani.pantha.auth.SignUpActivity;
import com.hassantijani.pantha.models.Slider;
import com.hassantijani.pantha.utils.SliderAdapter;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class OnboardingActivity extends AppCompatActivity {


    List<Slider> sliderList;
    ViewPager2 sliderViewPager;
    CircleIndicator3 indicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        sliderViewPager = findViewById(R.id.viewPager2);
        indicator = findViewById(R.id.circleIndicator3);
        sliderViewPager.setAdapter(new SliderAdapter(initSliderList()));
        indicator.setViewPager(sliderViewPager);
    }

    private List<Slider> initSliderList() {
        sliderList = new ArrayList<>();
        sliderList.add(new Slider(R.drawable.viewpager1,"Welcome to Panther"));
        sliderList.add(new Slider(R.drawable.viewpager2,"Reliable couriers & vendors"));
        sliderList.add(new Slider(R.drawable.viewpager3,"Shop from your favorite \n supermarkets"));
        sliderList.add(new Slider(R.drawable.viewpager4,"Fresh meals at your fingertips"));


        return sliderList;
    }


    public void login(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void goToSignUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}