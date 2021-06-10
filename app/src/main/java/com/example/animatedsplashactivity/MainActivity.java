package com.example.animatedsplashactivity;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(9000);

                } catch (Exception e) {

                } finally {

                        Intent intent=new Intent(MainActivity.this,Homepage.class);
                        startActivity(intent);
                        finish();




                }
            }//;
        };
        splashTread.start();

    }



}