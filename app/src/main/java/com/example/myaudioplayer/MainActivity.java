package com.example.myaudioplayer;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

public class MainActivity
        extends AppCompatActivity
        implements LibraryFragment.OnFragmentInteractionListener,
        PlaylistsFragment.OnFragmentInteractionListener,
        NowPlayingFragment.OnFragmentInteractionListener {


    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tabLibrary;
    TabItem tabPlaylists;
    TabItem tabNowPlaying;
    MyPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        tabLibrary = findViewById(R.id.library_tab);
        tabPlaylists = findViewById(R.id.playlists_tab);
        tabNowPlaying = findViewById(R.id.now_playing_tab);

        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        // the pagerAdapter tell the viewPager to set the right fragment
        viewPager.setAdapter(pagerAdapter);
        // but the tab doesn't change because it is not in sync, so we add a listener
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 1:  // Playlists tab
                        // change the tab layout color
                        tabLayout.setBackgroundColor(ContextCompat.getColor(
                                MainActivity.this, R.color.colorAccent));
                        // change the status bar color (above the app)
                        getWindow().setStatusBarColor(ContextCompat.getColor(
                                MainActivity.this, R.color.colorAccent));
                        break;
                    case 2:  // Now Playing tab
                        // change the tab layout color
                        tabLayout.setBackgroundColor(ContextCompat.getColor(
                                MainActivity.this, R.color.colorPrimaryDark));
                        // change the status bar color (above the app)
                        getWindow().setStatusBarColor(ContextCompat.getColor(
                                MainActivity.this, R.color.colorPrimaryDark));
                        break;
                    default:  // Library tab
                        // change the tab layout color
                        tabLayout.setBackgroundColor(ContextCompat.getColor(
                                MainActivity.this, R.color.colorPrimary));
                        // change the status bar color (above the app)
                        getWindow().setStatusBarColor(ContextCompat.getColor(
                                MainActivity.this, R.color.colorPrimary));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
