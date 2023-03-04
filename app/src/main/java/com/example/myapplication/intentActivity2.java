package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intentActivity2 extends AppCompatActivity {

    private Button bttn;
    private Button bttn1;
    private Button bttn2;
    private Button bttn3;
    private Button bttn4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bttn = (Button)findViewById(R.id.cıkısbuton);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cıkıs=new Intent(intentActivity2.this,MainActivity.class);
                startActivities(new Intent[]{cıkıs});
            }

    });
}
}