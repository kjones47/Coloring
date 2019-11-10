package com.example.android.coloring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private int pic = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mush = findViewById(R.id.mushroom);
        mush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic = 0;
            }
        });
        Button fire = findViewById(R.id.fireflower);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic = 1;
            }
        });
        Button draw = findViewById(R.id.drawyourown);
        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic = 2;
            }
        });
    }
}
