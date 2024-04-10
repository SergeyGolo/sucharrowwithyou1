package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void onButtonClick21(View view) {
        Intent intent = new Intent(this, VerificationActivity.class);
        startActivity(intent);
    }
    public void onButtonClick22(View view) {
        Intent intent = new Intent(this, FiveActivity.class);
        startActivity(intent);
    }
    public void onButtonClick23(View view) {
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }

}