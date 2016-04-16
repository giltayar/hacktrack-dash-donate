package com.inbal.dashdonate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
//import
import com.bumptech.glide.Glide;

import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
ImageView gif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gif = (ImageView) findViewById(R.id.gif);
        Glide.with(this).load(R.drawable.loading).asGif().into(gif);
        android.os.Handler h = new android.os.Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,SignUp.class);
                startActivity(i);
            }
        },5000);
     }
}
