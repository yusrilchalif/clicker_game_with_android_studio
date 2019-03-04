package com.example.mry5513.clickergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.count_initial_value);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.app_name, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countDown(View view){
        mCount--;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void resetButton(View view) {
        mCount = 0;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
