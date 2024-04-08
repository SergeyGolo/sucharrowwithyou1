package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void onButtonClick5(View view) {
        Intent intent = new Intent(this, FiveActivity.class);
        startActivity(intent);
    }

    public void onButtonClick6(View view) {
        Intent intent = new Intent(this, CreateAnAccount.class);
        startActivity(intent);
    }
}


