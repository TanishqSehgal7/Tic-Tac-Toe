package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2ActivityTictactoe extends AppCompatActivity {
public static final String SECONDACT ="com.example.tictactoe";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_tictactoe);
    }

    public void sendMsg(View view){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
