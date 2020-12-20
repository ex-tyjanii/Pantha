package com.hassantijani.pantha.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.hassantijani.pantha.auth.AgentSignUpFragment;
import com.hassantijani.pantha.auth.UserSignUpFragment;

public class SignUpPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = new String[] {"As a User", "As an agent"};


    public SignUpPagerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new UserSignUpFragment();
        } else {
            return new AgentSignUpFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
