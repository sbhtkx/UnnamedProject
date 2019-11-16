package com.example.myaudioplayer;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class LibraryPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;

    LibraryPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragmentList = new ArrayList<>();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    void addFragment(Fragment fragment, int currentPosition){
        // remove all fragments right to currentPosition
//TODO        fragmentList = fragmentList.subList(currentPosition + 1, fragmentList.size());
        fragmentList.add(fragment);
        notifyDataSetChanged();
    }
}
