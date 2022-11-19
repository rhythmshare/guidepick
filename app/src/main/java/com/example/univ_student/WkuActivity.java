package com.example.univ_student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WkuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wku);

        Button restaurant_btn = (Button) findViewById(R.id.restaurant);
        restaurant_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WkuActivity.this, Restaurant_wkuActivity.class);
                startActivity(intent);
            }
        });
    }
}