package com.example.myaudioplayer;

public class DataHolder {

    private static final DataHolder dataHolder = new DataHolder();

    public static DataHolder getInstance(){
        return dataHolder;
    }
}
