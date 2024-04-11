package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
    public void onButtonClick80(View view) {
        Intent intent = new Intent(this, NoteficationActivity.class);
        startActivity(intent);
    }

    public void onButtonClick79(View view) {
        Intent intent = new Intent(this, PackageActivity.class);
        startActivity(intent);
    }

    public void openLink(View view) {
        String url = "https://support.google.com/accounts/answer/7682439?hl=ru";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void onButtonClick100(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}