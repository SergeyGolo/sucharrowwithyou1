package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PackagetwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packagetwo);
    }

    public void onButtonClick26(View view) {
        Intent intent = new Intent(this, PackageActivity.class);
        startActivity(intent);
    }
    public void onButtonClick27(View view) {
        Intent intent = new Intent(this, PackageActivity.class);
        startActivity(intent);
    }

    public void onButtonClick28(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}