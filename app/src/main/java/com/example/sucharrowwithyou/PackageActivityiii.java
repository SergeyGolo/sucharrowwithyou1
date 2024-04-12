package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PackageActivityiii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_activityiii);
    }

    public void suciii(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

}