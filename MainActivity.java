package com.onurelmaci.hellojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImg(View view) {

        ImageView imageView = findViewById(R.id.kokoprime);
        imageView.setImageResource(R.drawable.reciept);


    }


}