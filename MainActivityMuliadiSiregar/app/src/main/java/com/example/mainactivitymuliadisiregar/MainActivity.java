package com.example.mainactivitymuliadisiregar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsecondActivity = findViewById(R.id.btn_second_activity);
        Button btnsecondActivityImplicit = findViewById(R.id.btn_second_activity_implicit);
        EditText etInput = findViewById(R.id.et_input);
        EditText etPhoneNumber = findViewById(R.id.et_phone_number);

        btnsecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = etInput.getText().toString()

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        };

        btnsecondActivityImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone_number =etPhoneNumber.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: + phone_number"));
                startActivity(intent);

            }
        });
    }
}