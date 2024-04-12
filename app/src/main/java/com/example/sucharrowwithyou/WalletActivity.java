package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WalletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
    }
    public void onButtonClick121(View view) {
        Intent intent = new Intent(this, PaymentMethodActivity.class);
        startActivity(intent);
    }

    public void onButtonClick122(View view) {
        Intent intent = new Intent(this, NoteficationActivity.class);
        startActivity(intent);
    }

    public void onButtonClick100(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    public void onButtonClick123(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void onButtonClick124(View view) {
        Intent intent = new Intent(this, TrackActivity.class);
        startActivity(intent);
    }
}