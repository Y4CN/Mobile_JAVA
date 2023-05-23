package com.example.test_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editTextTextEmailAddress);
        editText.setText("Y4CN");
        Date date = new Date();
        TextView textView = findViewById(R.id.text1);
        textView.setText(date.toString());



        //Button Click
        Button btnSecondActivity = findViewById(R.id.btnSecond);
        TextView textView_hello = findViewById(R.id.textView);
        Button btn1 = findViewById(R.id.btn1);


        btn1.setOnClickListener(v -> {
            Random random = new Random();
            textView_hello.setText("Button Clicked !!");
            textView_hello.setTextColor(Color.rgb(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            textView.setVisibility(v.INVISIBLE);
            btn1.setText("CLICKED");
        });



        //*** کد زیر با کد بالایی مثل همه و فرقی نمیکنه

//     btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Random random = new Random();
//                textView_hello.setText("Button Clicked !!");
//                textView_hello.setTextColor(Color.rgb(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
//                textView.setVisibility(v.INVISIBLE);
//            }
//        });

        //Long cLick
        btn1.setOnLongClickListener(v -> {
            btn1.setText("LONG CLICKED");
            //true only for long click & false for long and click both
            return false;
        });

        btnSecondActivity.setOnClickListener(v -> {
            //we can Say MainActivity.this
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        });

        //this will change the Hello World Color Randomly

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Random random = new Random();
//                textView_hello.setTextColor(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
//            }
//        });


//        btn.setOnClickListener(v -> btnClicked(v));
//        btn1.setOnClickListener(v ->Toast.makeText(getApplicationContext(),"Clicked", Toast.LENGTH_LONG).show());
    }

//    private void btnClicked(View v) {
//        if (v.getId() == R.id.btn1) {
////            Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_LONG);
//            Random random = new Random();
//            textView.setTextColor(Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
//        }
//    }
}

