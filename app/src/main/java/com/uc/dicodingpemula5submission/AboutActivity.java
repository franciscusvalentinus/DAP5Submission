package com.uc.dicodingpemula5submission;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About Me");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
     }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}


