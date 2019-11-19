package com.example.myaudioplayer;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class LibraryActivity extends AppCompatActivity {

    TabLayout tabLayout;

    LibraryPagerAdapter libraryPagerAdapter;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        tabLayout = findViewById(R.id.tab_layout);



        viewPager = findViewById(R.id.viewPager);
        libraryPagerAdapter = new LibraryPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(libraryPagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        addFirstTab();



    }

    private void addFirstTab() {

        tabLayout.addTab(tabLayout.newTab().setText("choose"));
        libraryPagerAdapter.addFragment(LibraryChoicesFragment.newInstance(), -1);
        viewPager.setCurrentItem(libraryPagerAdapter.getCount() - 1);
    }


    public void addTab(Fragment fragment, String title, int currentPosition){
            // remove all tabs right to currentPosition
            while (tabLayout.getTabCount() > currentPosition + 1) {
                tabLayout.removeTabAt(tabLayout.getTabCount() - 1);
            }

            tabLayout.addTab(tabLayout.newTab().setText(title));
            libraryPagerAdapter.addFragment(fragment, currentPosition);
            viewPager.setCurrentItem(libraryPagerAdapter.getCount() - 1);
    }

}
