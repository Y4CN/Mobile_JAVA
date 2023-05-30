package com.example.test_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class SecondActivity extends AppCompatActivity {


    //life cycle
    //onCreate Auto add in Our Java file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.textviewSecondActivity);
        Date date = new Date();
        Toast.makeText(this, "onCteated called", Toast.LENGTH_SHORT).show();
        textView.setText(date.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
//        TextView textView = findViewById(R.id.textviewSecondActivity);
//        Date date = new Date();
//        textView.setText(date.toString());
        Toast.makeText(this, "onStart called", Toast.LENGTH_SHORT).show();
    }

        @Override
    protected void onResume() {
        super.onResume();
            TextView textView = findViewById(R.id.textviewSecondActivity);
            Date date = new Date();
            textView.setText(date.toString());
            Toast.makeText(this, "onResume called", Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop called", Toast.LENGTH_SHORT).show();
    }
}