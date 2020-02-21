package com.example.myzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private Object ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView first_image =findViewById(R.id.image_desafiolatam);
        Picasso.get().load("https://desafiolatam.com/assets/home/logo-academia-bla-790873cdf66b0e681dfbe640ace8a602f5330bec301c409744c358330e823ae3.png").into(first_image);
        Button mybutton = findViewById(R.id.firstButton);
        Button buttonLogin = findViewById(R.id.second_Button);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"SuccefullLogin", Toast.LENGTH_LONG).show();
            }
        });
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "changeActivity", Toast.LENGTH_SHORT).show();
                intentExample();
            }
        });
    }

    private void intentExample(){
    Intent intent = new Intent(this, Home.class); startActivity(intent);
    }
}
