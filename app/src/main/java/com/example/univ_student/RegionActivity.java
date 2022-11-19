package com.example.univ_student;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class RegionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);

        ImageButton btn_wku = (ImageButton) findViewById(R.id.btn_wku);
        btn_wku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegionActivity.this, WkuActivity.class); // 화면 전환 테스트용(추후 제거)
                startActivity(intent);
            }
        });

        Spinner regionSpinner = (Spinner) findViewById(R.id.btn_spinner);
        String[] kinds1 = getResources().getStringArray(R.array.spinner_array);

        ArrayAdapter adapter = new ArrayAdapter(getBaseContext(),R.layout.spinner_item, kinds1);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        regionSpinner.setAdapter(adapter);
    }
}