package com.example.mkulimabora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityCrop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_crop);
    }

    public void gotopdf(View view) {
        Intent intent = new Intent(MainActivityCrop.this, CropActivity.class);
        startActivity(intent);
    }
}