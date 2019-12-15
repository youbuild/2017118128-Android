package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2Activity extends AppCompatActivity {

    public static final String TAG="MainActivity";
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        button1 = (Button) findViewById(R.id.Hellow1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        button2 = (Button) findViewById(R.id.Hellow2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2Activity.this, Activity2Activity.class);
                startActivity(intent);
            }
        });
        setTitle("王茗");
    }
}
