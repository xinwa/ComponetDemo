package com.xiwna.processor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.xiwna.annotation.RouterAnnotation;

@RouterAnnotation("xinwa://second")
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
