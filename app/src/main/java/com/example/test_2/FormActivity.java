package com.example.test_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {
    EditText editNameText ;
    EditText editPhoneText ;
    Button btnFormActivity ;
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editNameText = findViewById(R.id.editTextTextPersonName);
        editPhoneText = findViewById(R.id.editTextPhone);
        btnFormActivity = findViewById(R.id.btnFormActivity);
        textView = findViewById(R.id.TextViewFormActivity);
        editPhoneText.setEnabled(false);
        btnFormActivity.setEnabled(false);

        //create Listener :)
        editNameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length()>0) {
                    editPhoneText.setEnabled(true);
                    textView.setText(editNameText.getText().toString().trim());
                }else{
                    editPhoneText.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        editPhoneText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    btnFormActivity.setEnabled(true);
                }else{
                    btnFormActivity.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}