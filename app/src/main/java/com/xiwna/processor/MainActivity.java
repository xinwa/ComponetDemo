package com.xiwna.processor;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xiwna.router.Routers;

/**
 * @author xingping
 */
public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnStartSecond).setOnClickListener(v ->
                Routers.open(MainActivity.this, "xinwa://second")
        );

        findViewById(R.id.btnStartShare).setOnClickListener(v ->
                Routers.open(MainActivity.this, "xinwa://share")
        );

        findViewById(R.id.btnStartGift).setOnClickListener(v ->
                Routers.open(MainActivity.this, "xinwa://send_gift")
        );
    }
}
