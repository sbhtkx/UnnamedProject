package com.example.myaudioplayer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class LibraryPagerAdapter extends FragmentStatePagerAdapter {

    private int numOfTabs;


    LibraryPagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                //TODO
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.numOfTabs;
    }


    public void setNumOfTabs(int numOfTabs) {
        this.numOfTabs = numOfTabs;
    }

    public void incrementNumOfTabs(int numOfNewTabs) {
        this.numOfTabs += numOfNewTabs;
    }
}
