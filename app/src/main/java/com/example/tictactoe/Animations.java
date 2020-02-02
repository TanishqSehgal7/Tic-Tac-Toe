package com.example.tictactoe;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Animations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1=(Button) findViewById(R.id.button_00);
        final Button btn2=(Button) findViewById(R.id.button_01);
        final Button btn3=(Button) findViewById(R.id.button_02);
        final Button btn4=(Button) findViewById(R.id.button_10);
        final Button btn5=(Button) findViewById(R.id.button_11);
        final Button btn6=(Button) findViewById(R.id.button_12);
        final Button btn7=(Button) findViewById(R.id.button_20);
        final Button btn8=(Button) findViewById(R.id.button_21);
        final Button btn9=(Button) findViewById(R.id.button_22);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
//                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
//                        Color.WHITE);
//                anim.setDuration(1500);
//                anim.setEvaluator(new ArgbEvaluator());
////                anim.setRepeatMode(Animation.RESTART);
//                anim.setRepeatCount(Animation.INFINITE);
//                anim.start();
                btn1.setBackgroundColor(Color.BLUE);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
                        Color.WHITE);
                anim.setDuration(1500);
                anim.setEvaluator(new ArgbEvaluator());
//                anim.setRepeatMode(Animation.RESTART);
                anim.setRepeatCount(Animation.INFINITE);
                anim.start();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
                        Color.WHITE);
                anim.setDuration(1500);
                anim.setEvaluator(new ArgbEvaluator());
//                anim.setRepeatMode(Animation.RESTART);
                anim.setRepeatCount(Animation.INFINITE);
                anim.start();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
                        Color.WHITE);
                anim.setDuration(1500);
                anim.setEvaluator(new ArgbEvaluator());
//                anim.setRepeatMode(Animation.RESTART);
                anim.setRepeatCount(Animation.INFINITE);
                anim.start();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
                        Color.WHITE);
                anim.setDuration(1500);
                anim.setEvaluator(new ArgbEvaluator());
//                anim.setRepeatMode(Animation.RESTART);
                anim.setRepeatCount(Animation.INFINITE);
                anim.start();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
                        Color.WHITE);
                anim.setDuration(1500);
                anim.setEvaluator(new ArgbEvaluator());
//                anim.setRepeatMode(Animation.RESTART);
                anim.setRepeatCount(Animation.INFINITE);
                anim.start();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
                        Color.WHITE);
                anim.setDuration(1500);
                anim.setEvaluator(new ArgbEvaluator());
//                anim.setRepeatMode(Animation.RESTART);
                anim.setRepeatCount(Animation.INFINITE);
                anim.start();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
                        Color.WHITE);
                anim.setDuration(1500);
                anim.setEvaluator(new ArgbEvaluator());
//                anim.setRepeatMode(Animation.RESTART);
                anim.setRepeatCount(Animation.INFINITE);
                anim.start();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BlinkEffectChaluKar();
                ObjectAnimator anim = ObjectAnimator.ofInt(btn1, "backgroundColor", Color.WHITE, Color.RED,
                        Color.WHITE);
                anim.setDuration(1500);
                anim.setEvaluator(new ArgbEvaluator());
//                anim.setRepeatMode(Animation.RESTART);
                anim.setRepeatCount(Animation.INFINITE);
                anim.start();
            }
        });
    }

//    private void BlinkEffectChaluKar(){
//        ObjectAnimator animator=ObjectAnimator.ofInt(,)
//    }

}
