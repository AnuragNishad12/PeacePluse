package com.example.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.Elements.GeneralFragment.Fragemnt1;
import com.example.Elements.GeneralFragment.Fragment2;
import com.example.Elements.GeneralFragment.Fragment3;
import com.example.Elements.SocialFragment.SFragment1;
import com.example.Elements.SocialFragment.SFragment2;
import com.example.Elements.SocialFragment.SFragment3;

public class SocialAdapter extends FragmentPagerAdapter {
    public SocialAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new SFragment1();
            case 1:
                return new SFragment2();
            case 2:
                return new SFragment3();
            default:
                return new SFragment1();
        }

    }
    @Override
    public int getCount() {
        return 3;
    }
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            String title = null;
            if (position==0){
                title = "Intro";
            }
            if (position==1){
                title = "Signs";
            }
            if (position==2){
                title = "Tips";
            }
            return title;
        }

}
