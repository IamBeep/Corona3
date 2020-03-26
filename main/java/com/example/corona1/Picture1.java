package com.example.corona1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Picture1 extends AppCompatActivity implements View.OnClickListener {
    private ImageView CoronaImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture1);
        CoronaImageView =(ImageView) findViewById(R.id.CoronaImageView);
        CoronaImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.CoronaImageView);
        {
            CoronaImageView.setVisibility(view.VISIBLE);
        }

    }
}
