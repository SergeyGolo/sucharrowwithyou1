package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class TrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
    }
    public void openLink(View view) {
        String url = "https://support.google.com/accounts/answer/7682439?hl=ru";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
    public void onButtonClick160(View view) {
        Intent intent = new Intent(this, PackageActivityiii.class);
        startActivity(intent);
    }

    public void gotowallet(View view) {
        Intent intent = new Intent(this, WalletActivity.class);
        startActivity(intent);
    }

    public void onButtonClick21(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
    public void onButtonClick60(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}

