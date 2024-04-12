package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
public class MainActivity3 extends AppCompatActivity {
    private ImageView imageView;
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView = findViewById(R.id.imageView10);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.loadii);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setImageResource(R.drawable.loadiii);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView.setImageResource(R.drawable.loadiiii);

                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        imageView.setImageResource(R.drawable.suci);
                                        handler.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                imageView.setImageResource(R.drawable.sucii);
                                            }
                                        }, 400);
                                    }
                                }, 400);
                            }
                        }, 400);
                    }
                }, 400);
            }
        }, 400);
    }
    public void Home(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }


}