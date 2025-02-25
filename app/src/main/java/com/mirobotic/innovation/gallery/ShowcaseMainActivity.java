package com.mirobotic.innovation.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ShowcaseMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcase);

        findViewById(R.id.imgMap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(ShowcaseMainActivity.this,ShowcaseRoom234Activity.class));
            }
        });

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(ShowcaseMainActivity.this,MainActivity.class));
            }
        });

        findViewById(R.id.viewRoom2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShowcaseMainActivity.this,ShowcaseRoom234Activity.class));
            }
        });
        findViewById(R.id.viewRoom5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShowcaseMainActivity.this,ShowcaseRoom56Activity.class));
            }
        });
        findViewById(R.id.viewRoom6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShowcaseMainActivity.this,ShowcaseRoom56Activity.class));
            }
        });
        findViewById(R.id.viewSmartHome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShowcaseMainActivity.this,ShowcaseSmartHomeActivity.class));
            }
        });


    }
}
