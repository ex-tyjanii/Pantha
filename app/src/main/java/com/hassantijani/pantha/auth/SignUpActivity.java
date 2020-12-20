package com.hassantijani.pantha.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hassantijani.pantha.R;
import com.hassantijani.pantha.models.SignUpPagerAdapter;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ViewPager viewPager = findViewById(R.id.sign_up_viewpager);
        TabLayout tabLayout = findViewById(R.id.sign_up_tab_layout);

        viewPager.setAdapter(new SignUpPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT));

        // Give the TabLayout the ViewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}