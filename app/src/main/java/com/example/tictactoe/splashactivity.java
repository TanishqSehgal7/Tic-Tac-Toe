package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;

public class splashactivity extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splashactivity.this,Main2ActivityTictactoe.class);
                startActivity(intent);
                finish();
            }
        },1000);

    }
}
