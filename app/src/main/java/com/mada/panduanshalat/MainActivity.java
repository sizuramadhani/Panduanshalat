package com.mada.panduanshalat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView img = (ImageView) findViewById(R.id.btn1);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(),shalatsubuh.class);
                startActivity(i);
            }
        });

        final ImageView img1 = (ImageView) findViewById(R.id.btn2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(),shalatzuhur.class);
                startActivity(i);
            }
        });

        final ImageView img2 = (ImageView) findViewById(R.id.btn3);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(),shalatashar.class);
                startActivity(i);
            }
        });

        final ImageView img3 = (ImageView) findViewById(R.id.btn4);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(),shalatmaghrib.class);
                startActivity(i);
            }
        });

        final ImageView img4 = (ImageView) findViewById(R.id.btn5);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(),shalatisya.class);
                startActivity(i);
            }
        });
    }
}
