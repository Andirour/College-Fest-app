package com.sunnyapps.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
