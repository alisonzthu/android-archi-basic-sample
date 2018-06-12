package com.example.macstudio.basicsample;

import android.app.Application;


public class BasicApp extends Application {

    private AppExecutors mAppExecutors;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppExecutors = new AppExecutors();
    }

    public AppDatabase getDatabase() {
        // return an instance of app database
    }

    public DataRepository getRepository() {
//
    }
}
