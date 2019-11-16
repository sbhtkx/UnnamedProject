package com.example.myaudioplayer;

/**
 * a singleton that will contain data that need to be shared between activities
 * (or fragments)
 */
public class DataHolder {

    private static final DataHolder dataHolder = new DataHolder();

    public static DataHolder getInstance(){
        return dataHolder;
    }
}
