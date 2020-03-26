package com.example.corona1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.b3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetails1();

            }
        });
        button = (Button) findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeath1();

            }
        });
        button = (Button) findViewById(R.id.b2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPicture1();

            }
        });

    }
    public void openDetails1()

    {
        Intent intent =new Intent(this,Details1.class);
        startActivity(intent);

    }
    public void openPicture1()

    {
        Intent intent =new Intent(this,Picture1.class);
        startActivity(intent);

    }

    public void openDeath1()

    {
        Intent intent =new Intent(this,Death1.class);
        startActivity(intent);

    }


}
