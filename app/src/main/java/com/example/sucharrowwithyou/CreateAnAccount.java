package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class CreateAnAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_an_account);
    }

    public void openLink(View view) {
        String url = "https://support.google.com/accounts/answer/7682439?hl=ru";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void onButtonClick60(View view) {
        Intent intent = new Intent(this, FiveActivity.class);
        startActivity(intent);
    }
}