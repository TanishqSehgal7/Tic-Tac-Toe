package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2ActivityTictactoe extends AppCompatActivity {

public static final String SECONDACT ="com.example.tictactoe";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_tictactoe);
         Button btnStart=findViewById(R.id.buttonStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             startGame();

            }
        });
    }

        public void startGame(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
