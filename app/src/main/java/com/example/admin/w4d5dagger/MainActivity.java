package com.example.admin.w4d5dagger;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivityTAG_";
    private static final String SHARED_PREF_KEY = "SHARED_KEY";
    private static final String SHARED_PREF_VALUE = "SHARED_VALUE";
    private static final String SHARED_PREF_DEFAULT = "SHARED_DEFAULT";

    @Inject
    SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getSharedComponent().inject(this);


        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(SHARED_PREF_KEY, SHARED_PREF_VALUE);
        editor.apply();
    }
}
