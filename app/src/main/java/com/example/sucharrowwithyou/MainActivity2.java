package com.example.sucharrowwithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    private ImageView imageView;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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
    public void openLink(View view) {
        String url = "https://support.google.com/accounts/answer/7682439?hl=ru";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}