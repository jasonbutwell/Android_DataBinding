package com.jasonbutwell.databindingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jasonbutwell.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // We have this because we enclosed our layout.xml in a <layout> tag
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
