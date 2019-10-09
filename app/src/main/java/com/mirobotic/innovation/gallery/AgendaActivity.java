package com.mirobotic.innovation.gallery;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AgendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
        @Override
          public void onClick(View view) {
             onBackPressed();
            }
        });

    }
}
