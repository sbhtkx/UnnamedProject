package com.example.myaudioplayer;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
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

        libraryPagerAdapter = new LibraryPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

    }

    private void addTab(){
        tabLayout.addTab(tabLayout.newTab().setText("hello :)"));
//        libraryPagerAdapter
    }

}
