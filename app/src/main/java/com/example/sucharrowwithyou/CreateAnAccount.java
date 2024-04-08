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
        String url = "http://www.it-lex.ru/usloviya_ispolzovaniya_servisa/obrazec-politiki-konfidencialnosti-2017/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}