package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onButtonClick20(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }


    public void linkbt(View view) {
        String url = "https://support.google.com/accounts/answer/7682439?hl=ru";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void onButtonClick101w(View view) {
        Intent intent = new Intent(this, WalletActivity.class);
        startActivity(intent);
    }


    public void onButtonClick101p(View view) {
        Intent intent = new Intent(this, PackageActivity.class);
        startActivity(intent);
    }
    public void onButtonClick101c(View view) {
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(intent);
    }
    public void onButtonClick124(View view) {
        Intent intent = new Intent(this, WalletActivity.class);
        startActivity(intent);
    }

    public void onButtonClick125(View view) {
        Intent intent = new Intent(this, TrackActivity.class);
        startActivity(intent);
    }
}