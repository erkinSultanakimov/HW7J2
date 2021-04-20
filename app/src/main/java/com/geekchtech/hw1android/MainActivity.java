package com.geekchtech.hw1android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    boolean isCat, isDog, isSquirral;
    Button catBtn, dogBtn, squirrlBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initClickers();


    }


    private void correct() {
        Toast.makeText(MainActivity.this, "Вы угадали", Toast.LENGTH_SHORT).show();
    }

    private void inCorrect() {
        Toast.makeText(MainActivity.this, "Вы не угадали", Toast.LENGTH_SHORT).show();
    }


    private void initClickers() {
        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCat) {
                    correct();
                } else {
                    inCorrect();
                }
            }
        });

        dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDog) {
                    correct();
                } else {
                    inCorrect();
                }

            }
        });

        squirrlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSquirral) {
                    correct();
                } else {
                    inCorrect();
                }

            }
        });

    }


    private void initViews() {
        imageView = findViewById(R.id.animal_image);
        catBtn = findViewById(R.id.cat_button);
        dogBtn = findViewById(R.id.dog_botton);
        squirrlBtn = findViewById(R.id.squirrel);
    }

    @SuppressLint("NonConstantResourceId")
    public void changeImage(View view) {
        switch (view.getId()) {

            case R.id.image_first_button:
                imageView.setImageResource(R.drawable.cat);
                isCat = true;
                isSquirral = false;
                isDog = false;

                break;
            case R.id.image_second_button:
                imageView.setImageResource(R.drawable.dog);
                isDog = true;
                isCat = false;
                isSquirral = false;
                break;
            case R.id.image_third_button:
                imageView.setImageResource(R.drawable.squirrall);
                isSquirral = true;
                isCat = false;
                isDog = false;
                break;


        }
    }
}