package com.example.mathildapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello Lemon World");
    }

    public void launchCountApp(View view) {
        Intent intent = new Intent(this, countapp.class);
        startActivity(intent);

    }
}
