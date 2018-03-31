package com.example.mathildapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class countapp extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private static final String LOG_TAG = countapp.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onCreate");
        setContentView(R.layout.activity_countapp);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }


    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void restart(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void Return(View view) {
        Log.d(LOG_TAG, "End count activity");
        finish();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    // TODO : add highestScore
    // TODO : save highestScore in a file
    // TODO : add a score item
    // TODO : replace by a game
    // TODO : run app and check log message
    // TODO : go ahead in tutorial
}
