package com.example.uts;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Deklarasi variable

        View rootView = findViewById(android.R.id.content);

        ImageButton btn1 = findViewById(R.id.imageButton1);
        ImageButton btn2 = findViewById(R.id.imageButton2);
        ImageButton btn3 = findViewById(R.id.imageButton3);
        ImageButton btn4 = findViewById(R.id.imageButton4);
        ImageButton btn5 = findViewById(R.id.imageButton5);
        ImageButton btn6 = findViewById(R.id.imageButton6);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (mp != null){
                    mp.release();
                }
                mp = MediaPlayer.create(MainActivity.this,R.raw.sound_2);
                mp.start();

                Snackbar.make(rootView,"Anda Menekan Button Meow 1",Snackbar.LENGTH_SHORT).show();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (mp != null){
                    mp.release();
                }
                mp = MediaPlayer.create(MainActivity.this,R.raw.sound_6);
                mp.start();

                Snackbar.make(rootView,"Anda Menekan Button Meow 2",Snackbar.LENGTH_SHORT).show();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (mp != null){
                    mp.release();
                }
                mp = MediaPlayer.create(MainActivity.this,R.raw.sound_5);
                mp.start();

                Snackbar.make(rootView,"Anda Menekan Button Meow 3",Snackbar.LENGTH_SHORT).show();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (mp != null){
                    mp.release();
                }
                mp = MediaPlayer.create(MainActivity.this,R.raw.sound_3);
                mp.start();

                Snackbar.make(rootView,"Anda Menekan Button Meow 4",Snackbar.LENGTH_SHORT).show();
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (mp != null){
                    mp.release();
                }
                mp = MediaPlayer.create(MainActivity.this,R.raw.sound_4);
                mp.start();

                Snackbar.make(rootView,"Anda Menekan Button Meow 5",Snackbar.LENGTH_SHORT).show();
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (mp != null){
                    mp.release();
                }
                mp = MediaPlayer.create(MainActivity.this,R.raw.sound_1);
                mp.start();

                Snackbar.make(rootView,"Anda Menekan Button Meow 6",Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}