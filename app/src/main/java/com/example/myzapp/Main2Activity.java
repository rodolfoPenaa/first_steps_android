package com.example.myzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button_SignIn = findViewById(R.id.button_SignIn);
        button_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "Succefull Sign In", Toast.LENGTH_LONG).show();
                intenttoLoginActivity();
            }
         });
    }

    private void intenttoLoginActivity() {
        Intent intentLogin = new Intent(this, MainActivity.class);
        startActivity(intentLogin);
    }
}
