package com.example.admin.w4d5dagger;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * Created by admin on 4/28/2016.
 */
public class App extends Application {

    private SharedComponent mSharedComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mSharedComponent = DaggerSharedComponent.builder().appModule(new AppModule(this)).sharedModule(new SharedModule("Hello")).build();

    }

    public SharedComponent getSharedComponent() {
        return mSharedComponent;
    }
}
